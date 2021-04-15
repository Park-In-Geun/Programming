//
//  ViewController.swift
//  Dictonary_20145128(2)
//
//  Created by hallym-de1111 on 2019. 9. 19..
//  Copyright © 2019년 Park. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var Name: UITextField!
    @IBOutlet var Number: UITextField!
    @IBOutlet var Address: UITextField!
    @IBOutlet var textView: UITextView!
    
    var dic1=["박인근": "010-0000-0000", "홍길동": "010-0001-0002", "김흥국": "010-0001-0010", "박명수": "010-0020-0101", "유재석": "010-1234-1233", "노홍철": "010-0123-4123", "정형돈": "010-3333-4444", "하하": "010-5224-1234", "최종훈": "010-5234-5215", "김재욱": "010-3452-1231", "김호창": "010-2345-1236", "이용주": "010-5512-5151", "이한별": "010-1467-5125", "원유리": "010-9874-4664", "이상혁": "010-1122-2211", "고동빈": "010-1775-5858", "안정환": "010-9090-8080", "최태욱": "010-4444-5555", "삽살개": "010-9090-0909", "김빵빵": "010-1111-7777"]
    
    var dic2=["박인근": "서울시 광진구", "홍길동": "서울시 노원구", "김흥국": "서울시 중랑구", "박명수": "서울시 성북구", "유재석": "서울시 용산구", "노홍철": "서울시 서대문구", "정형돈": "서울시 송파구", "하하": "서울시 강남구", "최종훈": "서울시 강북구", "김재욱": "서울시 서초구", "김호창": "서울시 강동구", "이용주": "서울시 강서구", "이한별": "서울시 구로구", "원유리": "서울시 동대문구", "이상혁": "서울시 마포구", "고동빈": "서울시 도봉구", "안정환": "서울시 은평구", "최태욱": "서울시 금천구", "삽살개": "서울시 관악구", "김빵빵": "서울시 영등포구"]
    
    @IBOutlet var btnList: UIButton!
    @IBOutlet var btnSearch: UIButton!
    @IBOutlet var btnUpdate: UIButton!
    @IBOutlet var btnInsert: UIButton!
    @IBOutlet var btnRemove: UIButton!
    var txtName: String = ""
    var txtNumber: String = ""
    var txtAddress: String = ""
    var wordN = "" //key
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    @IBAction func btnList(_ sender: UIButton) {
        textView.text = ""
        
        for (txtName, txtNumber) in dic1 {
            textView.text = textView.text! + "\(txtName) : \(txtNumber) : \(dic2[txtName]!) \n"
        }
    }
    
    @IBAction func btnSearch(_ sender: UIButton) {
        textView.text = ""
        wordN = Name.text!
        txtName = Name.text!
        txtNumber = Number.text!
        txtAddress = Address.text!
        

        if dic1.keys.contains(wordN) {
            textView.text = "해당하는 이름의 정보를 찾았습니다. \n\n"
            textView.text = textView.text! + "\(txtName) : \(dic1[wordN]!) : \(dic2[wordN]!) \n"
        }
        else{
            textView.text = "해당하는 이름을 찾지 못했습니다."
        }
    }
    
    @IBAction func btnUpdate(_ sender: UIButton) {
        textView.text = ""
        wordN = Name.text!
   
        if dic1.keys.contains(wordN) {
            textView.text = "업데이트를 완료하였습니다. \n\n"
            dic1[wordN] = Number.text!
            dic2[wordN] = Address.text!
            for (txtName, txtNumber) in dic1 {
                textView.text = textView.text! + "\(txtName) : \(txtNumber) : \(dic2[txtName]!) \n"
            }
        }
        else{
            textView.text = "업데이트 할 내용이 없습니다. 이름을 확인해 주세요."
        }
    }
    @IBAction func btnInsert(_ sender: UIButton) {
        textView.text = ""
        wordN = Name.text!
        txtName = Name.text!
        
        if dic1.keys.contains(wordN) {
            textView.text = "이름이 이미 존재합니다. 다시 확인 해 주세요."
        }
        else {
            textView.text = "추가를 완료하였습니다.\n\n"
            dic1[txtName] = Number.text!
            dic2[txtName] = Address.text!
        }
    }
    
    @IBAction func btnRemove(_ sender: UIButton) {
        textView.text = ""
        wordN = Name.text!
        txtName = Name.text!
        
        if dic1.keys.contains(wordN) {
            textView.text = "삭제를 완료하였습니다.\n\n"
            dic1[txtName] = nil
            dic2[txtName] = nil
        }
        else {
            textView.text = "삭제할 이름을 찾지 못하였습니다. 다시 확인 해 주세요."
        }
    }
    
}

