//
//  ViewController.swift
//  Week6_20145128
//
//  Created by 한림 on 2019. 10. 2..
//  Copyright © 2019년 hallym. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    let imgOn = UIImage(named: "lamp-on.png") // 램프 ON 사진 변수
    let imgOff = UIImage(named: "lamp-off.png") // 램프 Off 사진 변수
    let imgRemove = UIImage(named: "lamp-remove.png") // 램프 제거 사진
    var isLampOn = true // 램프가 ON 인지 OFF 인지 확인하는 변수
    var checkRemove = true // 제거 상태인지 생성 상태인지 확인하는 변수
    
    @IBOutlet var lampImg: UIImageView! // 램프 이미지 보여줄 이미지 뷰 아울렛 변수
    @IBOutlet var btnA: UIButton!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        lampImg.image = imgOn // 초기 이미지를 램프 ON 상태 이미지로 설정
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func btnLampOn(_ sender: UIButton) {
        // 램프 켜기 버튼 함수
        if(checkRemove==true){ // 제거 버튼 상태일 경우를 확인
            if(isLampOn==true){ // 램프가 On 상태 인지 확인
               
                let lampOnAlert = UIAlertController(title: "경고", message: "현재 On 상태입니다.", preferredStyle: UIAlertControllerStyle.alert)
                //  경고 메세지 제목, 문구, 얼럿 스타일을 지정합니다.
                
                let onAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
                // 후속 조치로 버튼에 띄울 문구, 버튼 스타일, 버튼 누른 후 실행할 행동을 지정합니다.
                
                lampOnAlert.addAction(onAction)
                // lampOnAlert 얼럿에 onAction 버튼을 추가합니다.
                
                present(lampOnAlert, animated: true, completion:  nil)
                // lampOnAlert 얼럿을 화면에 나타나게 하며, 화면에 얼럿이 어떻게 나올지 결정하고 얼럿을 화면에 나오게 한 후 행동을 지정합니다.
            }
            else{ // 램프가 Off 상태일 경우를 확인
                let lampOnAlert = UIAlertController(title: "램프 켜기", message: "램프를 켜시겠습니까?", preferredStyle: UIAlertControllerStyle.alert)
                //  경고 메세지 제목, 문구, 얼럿 스타일을 지정합니다.
                
                let onAction = UIAlertAction(title: "네", style: UIAlertActionStyle.default, handler: {ACTION in self.lampImg.image = self.imgOn
                    self.isLampOn = true
                })
                // 후속 조치로 버튼에 띄울 문구, 버튼 스타일, 버튼 누른 후 실행할 행동을 지정합니다. 이미지를 imgOn 로 변경해주고 isLampOn 변수를 true(램프 On 상태)로 변경합니다.
                
                let cancelAction = UIAlertAction(title: "아니요", style: UIAlertActionStyle.default, handler: nil)
                // 후속 조치로 버튼에 띄울 문구, 버튼 스타일, 버튼 누른 후 실행할 행동을 지정합니다. handler 를 nil 값을 주어 아무 행동도 취하지 않게 합니다.
                
                lampOnAlert.addAction(onAction)
                // lampOnAlert 얼럿에 onAction 버튼을 추가합니다.
                lampOnAlert.addAction(cancelAction)
                // lampOnAlert 얼럿에 cancelAction 버튼을 추가합니다.
                
                present(lampOnAlert, animated: true, completion: nil)
                // lampOnAlert 얼럿을 화면에 나타나게 하며, 화면에 얼럿이 어떻게 나올지 결정하고 얼럿을 화면에 나오게 한 후 행동을 지정합니다.
            }
        }
        else{ // 생성 버튼 상태일 경우
            
            let lampOnAlert = UIAlertController(title: "경고", message: "해당 버튼을 사용할 수 없습니다", preferredStyle: UIAlertControllerStyle.alert)
            
            let onAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
            lampOnAlert.addAction(onAction)
            present(lampOnAlert, animated: true, completion:  nil)
        
            // 위의 코드들과 같은 기능을 하는 함수들입니다.
        }
        
    }
    
    @IBAction func btnLampOff(_ sender: UIButton) {
        // 램프 끄기 버튼 함수
        if(checkRemove == true){ // 제거 버튼 상태일 경우
            if isLampOn { // 램프가 켜져있을 경우
                let lampOffAlert = UIAlertController(title: "램프 끄기", message: "램프를 끄시겠습니까?", preferredStyle: UIAlertControllerStyle.alert)
                
                let offAction = UIAlertAction(title: "네", style: UIAlertActionStyle.default, handler: {ACTION in self.lampImg.image = self.imgOff
                    self.isLampOn = false
                })
                let cancelAction = UIAlertAction(title: "아니요", style: UIAlertActionStyle.default, handler: nil)
                
                lampOffAlert.addAction(offAction)
                lampOffAlert.addAction(cancelAction)
                
                present(lampOffAlert, animated: true, completion: nil)
                // 코드들은 램프 켜기 버튼 함수와 같은 기능입니다.
            }
            else{
                let lampOffAlert = UIAlertController(title: "경고", message: "현재 Off 상태입니다.", preferredStyle: UIAlertControllerStyle.alert)
                let offAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
                lampOffAlert.addAction(offAction)
                present(lampOffAlert, animated: true, completion:  nil)
                
                // 위의 코드들과 같은 기능을 하는 함수들입니다.
            }
        }
        else{ // 생성 버튼 상태일 경우
            let lampOffAlert = UIAlertController(title: "경고", message: "해당 버튼을 사용할 수 없습니다", preferredStyle: UIAlertControllerStyle.alert)
            let offAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
            lampOffAlert.addAction(offAction)
            present(lampOffAlert, animated: true, completion:  nil)
            // 위의 코드들과 같은 기능을 하는 함수들입니다.
        }
        
        
    }
    
    @IBAction func btnLampRemove(_ sender: UIButton) { // 제거 버튼 함수
        if checkRemove == true{ // 버튼이 제거 상태일 경우
            let lampRemoveAlert = UIAlertController(title: "램프 제거", message: "램프를 제거하시겠습니까?", preferredStyle: UIAlertControllerStyle.alert)
                // 경고 문구
            
            let offAction = UIAlertAction(title: "아니오, 끕니다(off).", style: UIAlertActionStyle.default, handler: {ACTION in self.lampImg.image = self.imgOff
                self.isLampOn = false
            }) // 후속조치 1 버튼 끄기. 이미지를 imgOff 로 변경, isLampOn을 false(램프 Off) 상태로 변경
            
            let onAction = UIAlertAction(title: "아니오, 켭니다(on).", style: UIAlertActionStyle.default){ACTION in self.lampImg.image = self.imgOn
                self.isLampOn = true
            } // 후속조치 2 버튼 켜기. 이미지를 imgOn 로 변경, isLampOn을 true(램프 On) 상태로 변경
            
            let removeAction = UIAlertAction(title: " 네, 제거합니다.", style: UIAlertActionStyle.destructive, handler: {
                ACTION in self.lampImg.image = self.imgRemove
                self.isLampOn = false
                self.btnA.setTitle("생성", for: .normal)
                self.checkRemove = false
            }) // 후속조치 3 램프 제거. 이미지를 imgRemove 로 변경, isLampOn을 false(램프 Off) 상태로 변경, 버튼의 이름을 "제거" 에서 "생성" 으로 변경, 버튼이 제거 상태인지 생성상태인지 확인하는 checkRemove 를 false 로 변경
            
            let cancelAction = UIAlertAction(title: "취소(cancel)", style: UIAlertActionStyle.default, handler: nil)
            // 후속조치 4 아무런 동작 안하게 합니다.
            
            lampRemoveAlert.addAction(offAction)
            lampRemoveAlert.addAction(onAction)
            lampRemoveAlert.addAction(removeAction)
            lampRemoveAlert.addAction(cancelAction)
            present(lampRemoveAlert, animated: true, completion:  nil)
            // 액션 버튼 추가
            
        }
        else{ // 버튼이 생성 상태일 경우
            let lampCreateAlert = UIAlertController(title: "램프 생성", message: "램프를 생성하시겠습니까?", preferredStyle: UIAlertControllerStyle.alert)
                // 경고 문구
            
            let onAction = UIAlertAction(title: "네, 생성합니다(create)", style:UIAlertActionStyle.default){ACTION in self.lampImg.image = self.imgOn
                self.isLampOn = true
                self.btnA.setTitle("제거", for: .normal)
                self.checkRemove = true
                } // 후속 조치 1 램프 생성. 이미지를 imgOn 으로 변경, isLampOn 을 true( 램프 On)로 변경, 버튼 이름을 "생성"에서 "제거" 상태로 변경, checkRemove 를 true 로 변경.
                
            let cancelAction = UIAlertAction(title: "취소(cancel)", style: UIAlertActionStyle.default, handler: nil)
                // 후속조치 2 아무런 동작 안하게 합니다.
            lampCreateAlert.addAction(onAction)
            lampCreateAlert.addAction(cancelAction)
            present(lampCreateAlert, animated: true, completion:  nil)
            // 액션 벼튼 추가
        }
   
    }
    
}

