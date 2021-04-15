//
//  ViewController.swift
//  week8
//
//  Created by hallym-de1111 on 2019. 10. 30..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit
import MapKit

class ViewController: UIViewController, CLLocationManagerDelegate {
    @IBOutlet var myMap: MKMapView!
    @IBOutlet var lblLocationInfo1: UILabel!
    @IBOutlet var lblLocationInfo2: UILabel!
    
    let locationManager1 = CLLocationManager()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        lblLocationInfo1.text = ""
        lblLocationInfo2.text = ""
        locationManager1.delegate = self
        locationManager1.desiredAccuracy = kCLLocationAccuracyBest
        // 정확도를 최고로 설정
        locationManager1.requestWhenInUseAuthorization()
        // 위치 데이터를 추적하기 위해 사용자에게 승인을 요구하는 함수.
        locationManager1.startUpdatingLocation()
        // 위치 업데이트 시작 함수
        myMap.showsUserLocation = true
        // 위치 보기 값을 true (허용)으로 설정
        
    }
    
    // 지정한 함수로 이동하는 함수
    func goLocation(latitudeValue : CLLocationDegrees, longitudeValue : CLLocationDegrees, delta span : Double) -> CLLocationCoordinate2D {
        // 지정된 위치와 관련된 위도와 경도를 반환한다.
        let pLocation = CLLocationCoordinate2DMake(latitudeValue, longitudeValue)
        
        // 지도 영역의 너비와 높이
        let spanValue = MKCoordinateSpan(latitudeDelta: span, longitudeDelta: span)
        
        // 특정 위도와 경도를 중심으로하는 직사각형 지리적 영역.
        let pRegion = MKCoordinateRegion(center: pLocation, span: spanValue)
        
        // 현재 표시되는 영역을 변경하고 필요에 따라 새 영역을 보고 싶을 경우 animate 를 true 를 지정한다.
        // false 일 경우 지정된 영역에 지도가 중앙에 오도록 한다.
        myMap.setRegion(pRegion, animated: true)
        return pLocation
    }
    
    // 지도를 관리하는 함수
    func locationManager(_ manager: CLLocationManager, didUpdateLocations locations: [CLLocation]){
        let pLocation = locations.last // 마지막 위치 값을 지정
        
        //마지막 위치의 위도, 경도 값을 가지고 goLocation 함수 호출. delta 값은 값이 작을수록 확대한다. 0.01 = 지도를 100배로 확대해서 보여준다.
        goLocation(latitudeValue: (pLocation?.coordinate.latitude)!, longitudeValue: (pLocation?.coordinate.longitude)!, delta: 0.01)
        // CLGeocoder class : 주소 -> 좌표, 좌표 -> 주소로 변경할 수 있는 기능을 가진 클래스
        //reverseGeocodeLocation : 좌표 값을 주소로 변경해주는 함수
        // 매개변수 = placemarks : 지정된 주소 값을 가지고 있는 배열. 단, 단일 위치로 확인할 수 없는 상황에서는 여러 장소 표시 객체를 반환 할 수 있다.
        //                     : 반환 값이 없을 경우 nil 반환
        //       = error       : 위치 표시 데이터가 반환되지 않는 이유를 가지고 있는 오류 코드
        CLGeocoder().reverseGeocodeLocation(pLocation!, completionHandler: { (placemarks, error) -> Void in
            let pm = placemarks!.first // 첫 부분만 대입
            let country = pm!.country // 나라 값을 대입
            var address:String = country! //나라 값을 문자열에 대입
            if pm!.locality != nil { // 지역 값이 존재 한다면
                address += " "
                address += pm!.thoroughfare! // 도로명 추가
            }
            self.lblLocationInfo1.text = "현재 위치"
            self.lblLocationInfo2.text = address // 도로 값도 추가로 대입
        })
        locationManager1.stopUpdatingLocation() // 마지막으로 위치가 업데이트 되는 것을 멈추게 하는 함수
    }
    
    func setAnnotation(latitudeValue : CLLocationDegrees, longitudeValue : CLLocationDegrees, delta span : Double, title strTitle : String, subtitle strSubtitle: String){
        // 핀을 설치하기 위해 MKPointAnnotation 함수를 사용
        let annotation = MKPointAnnotation()
        // coordinate 값을 받기위해 goLocation 함수를 사용하여 반환 값을 대입
        annotation.coordinate = goLocation(latitudeValue: latitudeValue, longitudeValue: longitudeValue, delta: span)
        
        annotation.title = strTitle // 제목
        annotation.subtitle = strSubtitle // 무제목
        myMap.addAnnotation(annotation) // myMap 에 annotation 추가
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @IBAction func sgChangeLocation(_ sender: UISegmentedControl) {
        if sender.selectedSegmentIndex == 0{ // 세그먼트 첫 번째
            locationManager1.startUpdatingLocation() // 어플리케이션에 지정되어있는 현재 위치로 업데이트 합니다.
        }
        else if sender.selectedSegmentIndex == 1{
            // 세그먼트 두 번째
            setAnnotation(latitudeValue: 37.8862292, longitudeValue: 127.7377722, delta: 0.01, title: "한림대학교", subtitle: "강원도 춘천시 옥천동 한림대학길 1")
            // 핀을 지정한 위도, 경도에 100배 확대하여 표시하고 제목을 한림대학교, 부제목을 강원도 춘천시 옥천동 한림대학길 1 로 지정
            
            self.lblLocationInfo1.text = "보고 계신 위치"
            self.lblLocationInfo2.text = "한림대학교 "
        }
        else if sender.selectedSegmentIndex == 2{
            // 세그먼트 세 번째
            setAnnotation(latitudeValue: 37.449069, longitudeValue: 126.452754, delta: 0.01, title: "공항로", subtitle: "인천광역시 중구")
            // 핀을 지정한 위도, 경도에 100배 확대하여 표시하고 제목을 공항로 , 부제목을 인천광역시 중구 로 지정
            self.lblLocationInfo1.text = "보고 계신 위치"
            self.lblLocationInfo1.text = "인천공항 공항로"
        }
    }
    

}

