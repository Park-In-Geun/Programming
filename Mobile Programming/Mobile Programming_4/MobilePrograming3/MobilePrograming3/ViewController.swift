//
//  ViewController.swift
//  MobilePrograming3
//
//  Created by hallym-de1111 on 2019. 9. 18..
//  Copyright © 2019년 InGeun-Park. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UIPickerViewDelegate, UIPickerViewDataSource {
    
    let MAX_ARRAY_NUM = 10 // 배열 사이즈
    let PICKER_VIEW_COLUMN = 1 // 피커뷰 의 가로
    let PICKER_VIEW_HEIGHT:CGFloat = 80 // 피커뷰의 높이(크기)
    
    var imageFileName = [ "01.png", "02.png", "03.png", "04.png", "05.png", "06.png", "07.png", "08.png", "09.png", "10.png" ]
    // 사용할 파일들의 배열
    
    @IBOutlet var pickerImage: UIPickerView! // 피커뷰 아울렛 변수
    @IBOutlet var lblImageFileName: UILabel! // 라벨 아울렛 변수
    @IBOutlet var imageView: UIImageView! // 이미지뷰 아울렛 변수
    var imageArray = [UIImage?]() // 이미지 출력하기 위한 배열 변수

    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    } // 정리할 메모리가 부족할 시 경고 메세지를 보여주는 함수
    
    //델리게이트 메서드들
    
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        return PICKER_VIEW_COLUMN //
    } // 피커뷰의 가로를 보여주기 위한 함수
    
    func pickerView(_ pickerView: UIPickerView, rowHeightForComponent component: Int) -> CGFloat {
        return PICKER_VIEW_HEIGHT
    } // 피커뷰의 세로를 보여주기 위한 함수
    
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return imageFileName.count
    } // 이미지 파일 배열의 행의 각 원소들을 보여주기 위한 함수
    
   // func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
    //    return imageFileName[row]
    //} 피커뷰를 이지마 피알 이름으로 보여주는 함수
    
    func pickerView(_ pickerView: UIPickerView, viewForRow row: Int, forComponent component: Int, reusing view: UIView?) -> UIView {
        let imageView = UIImageView(image:imageArray[row]) // imageView 변수에 각 행의 이미지 파일을 넣어주고 선언합니다.
        imageView.frame = CGRect(x: 0, y: 0, width: 100, height: 150) // 이미지의 크기를 가로 100, 세로 150으로 조정합니다. x좌표는 0 , y좌표는 0
        
        return imageView // 이미지 반환
    } // 피커뷰에 나타날 이미지를 조정하는 함수
    
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        lblImageFileName.text = imageFileName[row]
        imageView.image = imageArray[row]
    } // 이미지를 이미지 배열의 원소를 넣어주는 함수
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        for i in 0 ..< MAX_ARRAY_NUM {
            let image = UIImage(named: imageFileName[i])
            imageArray.append(image)
        } // 0부터 배열의 크기까지 반복하는 반복문으로 이미지 배열에 마지막 부터 이미지 파일을 넣어줌
        
        lblImageFileName.text = imageFileName[0] // 초기화면의 라벨 값을 초기화합니다.
        imageView.image = imageArray[0] // 초기화면의 이미지뷰 값을 초기화합니다.
    }


}

