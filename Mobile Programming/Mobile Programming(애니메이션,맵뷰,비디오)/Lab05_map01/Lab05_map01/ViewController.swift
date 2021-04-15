//
//  ViewController.swift
//  Lab05_map01
//
//  Created by hallym-de1111 on 2019. 10. 22..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit
import MapKit

class ViewController: UIViewController {
    @IBOutlet var latitude: UITextField!
    @IBOutlet var longitude: UITextField!
    @IBOutlet var mapView: MKMapView!
    @IBOutlet var latSlider: UISlider!
    @IBOutlet var longSlide: UISlider!
    
    var currentlat : Double? = 37.886246
    var currentlong : Double? = 127.738189
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        latSlider.maximumValue = 1.0
        latSlider.minimumValue = -1.0
        latSlider.value = 0.0
        longSlide.maximumValue = 1.0
        longSlide.minimumValue = -1.0
        longSlide.value = 0.0

        let location = CLLocationCoordinate2DMake(37.886246, 127.738189)
        let span = MKCoordinateSpanMake(0.005, 0.005)
        let region = MKCoordinateRegionMake(location, span)
        mapView.setRegion(region, animated: true)
        let annotation = MKPointAnnotation()
        annotation.coordinate = location
        annotation.title = "한림대학교"
        annotation.subtitle = "강원도 춘천시 옥천동 한림대학길 1"
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func btn(_ sender: UIButton) {
        let ltd = Double(latitude.text!)!
        let lgt = Double(longitude.text!)!
        let location = CLLocationCoordinate2DMake(ltd, lgt)
        let span = MKCoordinateSpanMake(0.005, 0.005)
        let region = MKCoordinateRegionMake(location, span)
        mapView.setRegion(region, animated: true)
        let annotation = MKPointAnnotation()
        annotation.coordinate = location
        annotation.title = "한림대학교"
        annotation.subtitle = "강원도 춘천시 옥천동 한림대학길 1"
    }
    
    @IBAction func latSlchange(_ sender: UISlider) {
        let ltd = currentlat! + Double(latSlider.value)
        let lgt = currentlong! + Double(longSlide.value)
        let location = CLLocationCoordinate2DMake(ltd, lgt)
        let span = MKCoordinateSpanMake(0.005, 0.005)
        let region = MKCoordinateRegionMake(location, span)
        mapView.setRegion(region, animated: true)
        let annotation = MKPointAnnotation()
        annotation.coordinate = location
        annotation.title = "변경된 지도"
       
    }
    
    @IBAction func longSlchange(_ sender: UISlider) {
        let ltd = currentlat! + Double(latSlider.value)
        let lgt = currentlong! + Double(longSlide.value)
        let location = CLLocationCoordinate2DMake(ltd, lgt)
        let span = MKCoordinateSpanMake(0.005, 0.005)
        let region = MKCoordinateRegionMake(location, span)
        mapView.setRegion(region, animated: true)
        let annotation = MKPointAnnotation()
        annotation.coordinate = location
        annotation.title = "변경된 지도"
    }
    
    @IBAction func segChange(_ sender: UISegmentedControl) {
        if sender.selectedSegmentIndex == 0{
            let location = CLLocationCoordinate2DMake(37.567173, 127.088382)
            let span = MKCoordinateSpanMake(0.001, 0.001)
            let region = MKCoordinateRegionMake(location, span)
            mapView.setRegion(region, animated: true)
            let annotation = MKPointAnnotation()
            annotation.coordinate = location
            annotation.title = "서울용곡초등학교"
            annotation.subtitle = "서울특별시 광진구 중곡4동 용마산로22길 82"
        }
        else if sender.selectedSegmentIndex == 1{
            let location = CLLocationCoordinate2DMake(37.547078, 127.101729)
            let span = MKCoordinateSpanMake(0.001, 0.001)
            let region = MKCoordinateRegionMake(location, span)
            mapView.setRegion(region, animated: true)
            let annotation = MKPointAnnotation()
            annotation.coordinate = location
            annotation.title = "서울광장중학교"
            annotation.subtitle = "서울특별시 광진구 광장동 광장로1길 1"
        }
        else{
            let location = CLLocationCoordinate2DMake(37.540182, 127.080487)
            let span = MKCoordinateSpanMake(0.001, 0.001)
            let region = MKCoordinateRegionMake(location, span)
            mapView.setRegion(region, animated: true)
            let annotation = MKPointAnnotation()
            annotation.coordinate = location
            annotation.title = "서울건대부고"
            annotation.subtitle = "서울특별시 광진구 자양1동 능동로 120"
        }
    }
    
}

