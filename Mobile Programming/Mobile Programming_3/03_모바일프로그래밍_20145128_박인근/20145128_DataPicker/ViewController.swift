//
//  ViewController.swift
//  20145128_DataPicker
//
//  Created by hallym-de1111 on 2019. 9. 11..
//  Copyright © 2019년 hallym. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    let timeSelector: Selector = #selector(ViewController.updateTime)
    let interval = 1.0
    var count = 0
    var currentTime = "" // 현재 시간때 사용할 변수
    var alarmTime = ""  // 선택 시간 사용할 변수
    var btn = false     // 알람 중지 버튼을 위한 변수
    var timer = false   // 1분을 카운트 하기 위한 변수
    
    @IBOutlet var lblCurrentTime: UILabel!
    @IBOutlet var lblPickerTime: UILabel!
    @IBOutlet var btnAlarm: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        Timer.scheduledTimer(timeInterval: interval, target: self, selector: timeSelector, userInfo: nil, repeats: true) // 시간을 나타내기 위한 타이머
        btnAlarm.isEnabled = false // 버튼 비활성화
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


    
    @IBAction func changeDatePicker(_ sender: UIDatePicker) { // 선택시간 설정 함수
        let datePickerView = sender // UIDatePicker 에 있는 값을 datePickerView 로 줌
        
        let formatter = DateFormatter() // 날짜를 텍트스로 표시 하기 위한 변수
        formatter.dateFormat = "yyyy-MM-dd HH:mm EEE" // 년-월-일 순 시간:분 요일 순으로 형식 지정
        lblPickerTime.text = "선택시간: " + formatter.string(from: datePickerView.date) // datePickerView 에 저장되어 있는 날짜를 선택시간: 뒤에 표시
        
        alarmTime = formatter.string(from: datePickerView.date) // alarmTime 이라는 변수에 선택시간 저장
        timer = false // timer 를 false 로 초기화
    }
    
    @objc func updateTime() { // 현재시간 설정 함수
        

        let date = NSDate() // 현재 시간을 저장하고 있는 객체 NSDate를 사용
        count = count + 1 // 1분 단위를 카운트 하기 위해 1초씩 더함
        let formatter = DateFormatter() // 날짜를 텍트스로 표시 하기 위한 변수
        formatter.dateFormat = "yyyy-MM-dd HH:mm EEE" // 년-월-일 순 시간:분 요일 순으로 형식 지정
        lblCurrentTime.text = "현재시간: " + formatter.string(from: date as Date) // datePickerView 에 저장되어 있는 날짜를 현재시간: 뒤에 표시
        
        currentTime = formatter.string(from: date as Date) // currentTime 이라는 변수에 선택시간 저장
        
        if(alarmTime == currentTime && timer == false && btn == false){
            // 현재시간과 선택시간이 같을 경우 화면을 빨간색으로 변화시켜주기 위한 조건문, 이 때 boolean형 timer 변수를 주어 한 번 같아진 경우에만 들어 올 수 있도록 조정하고 btn 변수를 주어 알람 중지 버튼을 활성화/비활성화 하기 위한 boolean형 변수
            view.backgroundColor = UIColor.red // 화면을 빨간색으로 만듦
            count = 0 // 선택시간과 현재시간 같을 경우 0으로 초기화
            btn = true // true 로 초기화
            btnAlarm.isEnabled = true // 버튼 활성화
        }
        else if(count == 60){ // 1분이 된 것을 확인하는 조건문
            view.backgroundColor = UIColor.white // 화면을 하얀색으로 만듦
            timer = false // false 로 초기화
            btn = false // btn 을 false 로 초기화
            btnAlarm.isEnabled = false // 버튼 비활성화
        }
        
    }
    
    
    @IBAction func alarmTime(_ sender: UIButton) { // 알람 중지(버튼 눌렀을 때)시 사용되는 함수
        if(btn == true){ // btn 변수가 true 일 경우
            view.backgroundColor = UIColor.white // 화면을 하얀색으로 만듦
            btn = false // false 로 초기화
            timer = true // true 로 초기화
            btnAlarm.isEnabled = false // 버튼 비활성화
        }
        
    }
}

