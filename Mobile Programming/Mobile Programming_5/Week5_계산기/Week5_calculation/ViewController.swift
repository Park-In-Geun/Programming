//
//  ViewController.swift
//  Week5_calculation
//
//  Created by hallym-de1111 on 2019. 9. 30..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var txtCalcul: UITextField! // 계산하는 텍스트 필드
    @IBOutlet var txtVar: UITextField! // 결과 값을 보여주는 텍스트 필드
    var result : Int! // Int 로 자료형 초기화
    var num1 : Int! // Int 로 자료형 초기화
    var num2 : Int! // Int 로 자료형 초기화
    var op : String! // String 으로 자료형 초기화
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        num1 = 0
        num2 = 0
        // 2개의 값의 연산을 하기 위해 숫자 변수 2개 선언
        op = "" // 연산자(+,-,*,/)중 하나를 가지게 하기 위한 변수
        result = 0 // 결과값을 저장할 변수
    }
    
    @IBAction func ButtonUpNum(_ sender: UIButton) {
        //숫자 버튼을 클릭 시 작동하는 액션 함수. 0~9 들의 sent event를 ButtonUpNum 함수로 연결시켜서 작동
        var digit = sender.currentTitle! // 버튼 클릭시의 현재의 상태를 계속 저장합니다.
        
        if(op == "" && result == 0) // 연산자 없고 결과 값이 0 일 경우를 확인합니다.
        {
            NSLog("txtVar : " + txtVar.text!) // 결과 텍스트 필드에 저장되고 있는 정보를 NSLOG 에 보여줍니다.
            txtVar.text = txtVar.text! + digit // 현재 값에 입력한 값(버튼 클릭)을 넣어 계산한 값을 텍스트 필드에 보여줍니다.
            txtCalcul.text = txtCalcul.text! + digit // 현재 값에 입력한 값(버튼 클릭)을 넣어서 텍스트 필드에 보여줍니다.
            
        }
        else if(op == "" && result != 0) // 연산자가 비어있고 계산 값이 0이 아닌 경우를 확인합니다.
        {
            txtVar.text = txtVar.text! + digit // 계산 한 값을 결과 텍스트 필드 창에 보여줍니다.
            txtCalcul.text = txtVar.text! // 현재 값에 입력한 값(버튼 클릭)을 넣어서 텍스트 필드에 보여줍니다.
        }
        else{
            txtVar.text = txtVar.text! + digit // 현재 값에 입력한 값(버튼 클릭)을 넣어 계산한 값을 텍스트 필드에 보여줍니다.
            txtCalcul.text = txtCalcul.text! + digit // 현재 값에 입력한 값(버튼 클릭)을 넣어서 텍스트 필드에 보여줍니다.
        }
        
    }
    
    @IBAction func ButtonUpOperation(_ sender: UIButton) {
        //연산자 버튼을 클릭 시 작동하는 액션 함수. 모든 연산자(+,-,*,/,=)버튼들의 sent event를 ButtonUpOperation 함수로 연결시켜서 작동
        let digit = sender.currentTitle! // 버튼 클릭시의 현재의 상태를 계속 저장합니다.
        if digit == "=" { // "=" 버튼을 클릭할 시 작동합니다.
            num2 = 0 // num2 을 0 으로 만듭니다.
            if(txtVar.text! == ""){ // 결과 텍스트 필드가 비어 있을 경우
                num2 = 0 // num2 을 0 으로 만듭니다.
            }
            else{ // 결과 텍스트 필드가 비어있지 않을 경우
                num2 = Int(txtVar.text!) // num2 에 결과 텍스트 필드에 있는 값을 넣어줍니다.
            }
            NSLog("txtVar.text = " + txtVar.text!) // 결과 텍스트 필드에 저장되고 있는 정보를 NSLOG 에 보여줍니다.
            if(num2 == 0) // num2 가 0일 경우
            {
                result = num1 // 결과 값에 num1 값을 넣습니다.
                txtVar.text = String(result) // 결과 텍스트 필드에 결과 값의 String 값을 넣습니다.
                txtCalcul.text = "" // 계산 텍스트 필드를 비웁니다.
            }
            else{
                if(op=="+"){ // 연산이 + 일 경우
                    result = num1 + num2 // 결과 값에 num1 과 num2 를 더한 값을 넣습니다.
                    txtVar.text = String(result) // 결과 텍스트 필드에 결과 값의 String 값을 넣습니다.
                    txtCalcul.text = "" // 계산 텍스트 필드를 비웁니다.
                }
                else if(op=="-"){ // 연산이 - 일 경우
                    result = num1 - num2 // 결과 값에 num1 과 num2 를 뺀 값을 넣습니다.
                    txtVar.text = String(result) // 결과 텍스트 필드에 결과 값의 String 값을 넣습니다.
                    txtCalcul.text = "" // 계산 텍스트 필드를 비웁니다.
                }
                else if(op=="*"){ // 연산이 * 일 경우
                    result = num1 * num2 // 결과 값에 num1 과 num2 를 곱한 값을 넣습니다.
                    txtVar.text = String(result) // 결과 텍스트 필드에 결과 값의 String 값을 넣습니다.
                    txtCalcul.text = "" // 계산 텍스트 필드를 비웁니다.
                }
                else if(op=="/"){ // 연산이 / 일 경우
                    result = num1 / num2 // 결과 값에 num1 과 num2 를 나눈 값을 넣습니다.
                    txtVar.text = String(result) // 결과 텍스트 필드에 결과 값의 String 값을 넣습니다.
                    txtCalcul.text = "" // 계산 텍스트 필드를 비웁니다.
                }
            }
            op = "" // 연산자를 비워줍니다.
            num1 = 0 // num1 을 0으로 바꿔줍니다.
            num2 = 0 // num2 를 0으로 바꿔줍니다.
        }
        else{ // "=" 버튼을 클릭하지 않을 시
            if(op == ""){ // 연산자가 비어있는지 확인합니다.
                op = digit // 연산자에 현재 버튼 클릭 상태 값을 넣어줍니다.
                num1 = Int(txtVar.text!) // num1 에 결과 텍스트 필드에 있는 값을 넣어줍니다.
                txtVar.text = "" // 결과 텍스트 필드를 비웁니다.
                txtCalcul.text = String(num1) + op // 계산 텍스트 필드에 num1 의 String 값 + op(연산자) 를 해줍니다.
            }
            else{ // 연산자가 비어 있지 않을 경우
                op = digit // 연산자에 현재 버튼 클릭 상태 값을 넣어줍니다.
                
                var txtNum = txtCalcul.text! // txtNum 변수를 선언하고 계산 텍스트 필드에 있는 값을 넣어줍니다.
                let startIndex = txtNum.startIndex // 계산 텍스트 필드의 첫 번째 인덱스 값을 넣어줍니다.
                let endIndex = txtNum.index(before:txtNum.endIndex) // 계산 텍스트 필드의 마지막 인덱스 전 값을 넣어줍니다.
                let range = startIndex..<endIndex // startIndex 에서 endIndex 까지를 range 에 넣어줍니다.
                num1 = Int(txtNum[range]) // num1 에 txtNum[range] 에 저장 된 값을 넣어줍니다.
                NSLog(String(txtNum)) // NSLOG 에 txtNum 값 String 형식으로 보여줍니다.
                NSLog(String(num1)) // NSLOG 에 num1 값을 String 형식으로 보여줍니다.
                txtVar.text = nil // 결과 텍스트 필드를 비워줍니다.
                txtCalcul.text = String(num1) + op // 계산 텍스트 필드에 num1 의 String 값 + op(연산자)를 해줍니다.
            }
        }
    }
    
    
    @IBAction func ButtonUpClear(_ sender: UIButton) {
        //C버튼을 클릭 시 작동하는 액션 함수. C버튼을 클릭하면 모든 내용을 초기화
        txtVar.text = "" // 결과 텍스트 필드를 비웁니다.
        txtCalcul.text = "" // 계산 텍스트 필드를 비웁니다.
        num1 = 0 // num1 을 0으로 만듭니다.
        num2 = 0 // num2 을 0으로 만듭니다.
        op = "" // op(연산자)를 비웁니다.
        result = 0 // 결과 값을 0으로 바꿉니다.
    }
    
    
    @IBAction func ButtonUpCancel(_ sender: UIButton) {
        //<- 버튼을 클릭시 작동하는 액션 함수. <- 버튼을 클릭하면 현재 입력 중인 숫자 정보(가장 최근의 값)를 하나씩 지움. 연산자는 지울 수 없음.
        if txtVar.text != ""{ // 결과 텍스트 필드가 비어 있지 않을 경우
            if(txtVar.text!.count>=2){ //결과 텍스트 필드의 길이가 2보다 크거나 같을 경우
                let upperBound1 = String.Index(encodedOffset:  txtVar.text!.count-2) // 결과 텍스트 필드의 마지막에서 -2(한글자) 지운 값을 upperBound1 에 저장합니다.
                let text1 = txtVar.text![...upperBound1] // text1 에 결과 텍스트 필드의 upperBound1 인덱스 끝까지를 넣어줍니다.
                NSLog(String(text1)) // NSLOG의 text1 을 보여줍니다.
                txtVar.text = String(text1) // 결과 텍스트 필드의 text1 String 형식 값을 넣어줍니다.
            }
            else{ // 결과 텍스트 필드의 길이가 2보다 작을 경우
                txtVar.text = nil // 결과 창을 비워줍니다.
            }
            if(txtCalcul.text!.count >= 2){ // 계산 텍스트 필드의 길이가 2보다 크거나 같을 경우
                let upperBound2 = String.Index(encodedOffset: txtCalcul.text!.count-2) // 계산 텍스트 필드의 마지막에서 -2(한글자) 지운 값을 upperBound2 에 저장합니다.
                let text2 = txtCalcul.text![...upperBound2] // text2 에 결과 텍스트 필드의 upperBound2 인덱스 끝까지를 넣어줍니다.
                txtCalcul.text = String(text2) // 계산 텍스트 필드의 text2 String 형식 값을 넣어줍니다.
            }
            else{ // 계산 텍스트 필드의 길이가 2보다 작을 경우
                txtCalcul.text = nil // 결과 창을 비워줍니다.
            }
        }
    }
    
    
}
