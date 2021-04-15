//
//  ViewController.swift
//  Dictionary_20145128(1)
//
//  Created by hallym-de1111 on 2019. 9. 19..
//  Copyright © 2019년 Park. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var Korean: UITextField!
    @IBOutlet var English: UITextField!
    @IBOutlet var textView: UITextView!
    
    var dictionary = ["컴퓨터":"computer", "모니터":"monitor", "2진수":"binary number", "10진수":"decimal","마우스":"mouse","키보드":"keyboard","입력":"input","출력":"output","주석":"remark","알고리즘":"algorithm","찾다":"Search","프로그래밍":"Programing","구조":"structure","언어":"language","임베디드":"embedded","영상처리":"image processing","시각화":"visualize","선형대수":"linear algebra","이산수학":"discrete mathematics","운영체제":"operting system"]
    var Kor: String = ""
    var Eng: String = ""
    var wordK = ""
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }


    @IBAction func BtnList(_ sender: UIButton) {
        textView.text = ""
        for (Kor,Eng) in dictionary {
            textView.text = textView.text! + "\(Kor) : \(Eng) \n"
        }
    }
    
    
    @IBAction func BtnSearch(_ sender: UIButton) {
        Kor = Korean.text!
        Eng = English.text!
        textView.text = ""
        wordK = Korean.text!
        
        
        if dictionary.keys.contains(wordK) {
            textView.text = "한글로 검색한 단어를 찾았습니다.\n\n\(Kor) : \(dictionary[wordK]!) \n"
        }
        else {
            textView.text = "한글 미입력 및 찾으시는 단어가 없습니다."
        }
    }
    
    
    @IBAction func BtnUpdate(_ sender: UIButton) {
        textView.text = ""
        wordK = Korean.text!
        
        if dictionary.keys.contains(wordK) {
            textView.text = "업데이트를 완료하였습니다.\n\n"
            dictionary[wordK] = English.text!
            for (Kor,Eng) in dictionary {
                textView.text = textView.text! + "\(Kor) : \(Eng) \n"
            }
        }
        else{
            textView.text = "업데이트 할 내용이 없습니다. 단어를 확인해 주세요."
        }
    }
    @IBAction func BtnInsert(_ sender: UIButton) {
        Kor = Korean.text!
        Eng = English.text!
        textView.text = ""
        wordK = Korean.text!
        
        if dictionary.keys.contains(wordK){
            textView.text = "이미 있는 단어 입니다. 확인해 주세요."
        }
        else{
            textView.text = "단어 추가를 완료하였습니다.\n\n"
            dictionary[Kor] = Eng
            for row in dictionary {
                let (Kor,Eng) = row
                textView.text = textView.text! + "\(Kor) : \(Eng) \n"
            }
        }

    }
    
    
    @IBAction func BtnRemove(_ sender: UIButton) {
        Kor = Korean.text!
        Eng = English.text!
        textView.text = ""
        wordK = Korean.text!
        
        if dictionary.keys.contains(wordK){
            textView.text = "삭제를 완료하였습니다. \n\n"
            dictionary[Kor] = nil
            for row in dictionary {
                let (Kor,Eng) = row
                textView.text = textView.text! + "\(Kor) : \(Eng) \n"
            }
        }
        else {
            textView.text = "없는 단어입니다. 확인해주세요."
        }
    }
}

