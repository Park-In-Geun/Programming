//
//  ViewController.swift
//  week5_
//
//  Created by hallym-de1111 on 2019. 9. 25..
//  Copyright © 2019년 Kim. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var Dic = [1:["A","B"]]
    var Dic2 : [Int : [String]] = [:]
    var Dic3 = [1:["AAA":"BBB"]]
    var Dic4 = ["김동영":["주소":"1211","전화번호":"010-1111-1111"]]
    // 딕셔너리 변수들
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        Dic[2] = ["C","D"]
        
        for (DicKey, DicValue) in Dic{
            NSLog("DicKey : "+String(DicKey)+", Dicvalue : "+DicValue[0]+DicValue[1])
        }
        // Dic 변수의 키 값(1,2)을 랜덤으로 지정하고 그에 따른 value 0,1번째 값을 이어서 로그 값에 보여줌
        
        
        Dic2[1] = ["CC","DD"]
        Dic2[2] = ["KK","ZZ"]
        Dic2[3] = ["HHH","AAA"]
        // Dic2 의
        Dic2.updateValue(["DDDD","ZZZZZ"], forKey: 2) //Dic2 의 키 값을 2로 지정하고 value 0,1 번째 값을 DDDD,ZZZZ 로 지정
        for (DicKey, DicValue) in Dic2{
            NSLog("DicKey : "+String(DicKey)+", DicValue : "+DicValue[0]+", "+DicValue[1])
        }
        // Dic2 의 키 값(1,2,3)을 랜덤으로 지정하고 value 0,1번째 값을 ,로 구분지어서 로그 값에 보여줌
        
        NSLog("Dic3[1] value's key : "+String(Dic3[1]!.keys.randomElement()!)+"Dic3[1] value's value : "+String(Dic3[1]!.values.randomElement()!))
        // Dic3의 key 값을 알 수 없으므로 randomElement()를 사용하여 랜덤으로 하나 가져옴(이 때, Dic3의 key 값은 AAA 하나 이므로 로그 값에 AAA만 나옴.
        // 마찬가지로 value 값을 알 수 없으므로 randomElement()를 사용하여 랜덤으로 하나 가져옴(이 때, Dic3의 value 값은 BBB 하나 이므로 로그 값에 BBB만 나옴.
        NSLog("Dic4[Key]'s 주소 : "+Dic4["김동영"]!["주소"]!+" / Dic4[key]'s 전화번호 : "+Dic4["김동영"]!["전화번호"]!)
        // Dic4 의 key 값을 알고 있는 경우, key 값을 지정하고 그에 따른 value 값을 찾아서 로그 값을 확인할 수 있음.
    }


}

