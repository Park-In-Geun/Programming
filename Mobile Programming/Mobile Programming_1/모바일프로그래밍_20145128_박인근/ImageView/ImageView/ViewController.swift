//
//  ViewController.swift
//  ImageView
//
//  Created by hallym-de1111 on 2019. 9. 4..
//  Copyright © 2019년 hallym. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var isZoom = false // 확대를 확인하는 조건 변수
    var imgOn: UIImage? // 켜진 전구 이미지가 있는 UIImage 타입의 변수
    var imgOff: UIImage? // 꺼진 전구 이미지가 있는 UIImage 타입의 변수
    var imgRemove: UIImage? // 사용, 제거에서 제거 시 사용할 이미지가 있는 UIImage 타입의 변수
    var isUse = false // 사용을 확인하는 조건 변수
    
    @IBOutlet var ImageView: UIImageView! // UIImageView 타입의 변수를 Outlet으로 연결
    @IBOutlet var btnResize: UIButton! //UIButton 타입의 변수를 Outlet으로 연결(확대, 축소 버튼)
    @IBOutlet var btnUse: UIButton! //UIButton 타입의 변수를 Outlet으로 연결(사용, 제거 버튼)
    @IBOutlet var SwitchOn: UISwitch! //UISwitch 타입의 변수를 Outlet으로 연결(스위치를 통한 램프 온, 오프)
    
    override func viewDidLoad() { // 생성자 개념, 실행 시 가장 먼저 실행되는 함수
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        imgOn = UIImage(named: "lamp-on.png") // lamp-on.png 이름의 이미지를 imgOn 변수에 지정합니다.
        imgOff = UIImage(named: "lamp-off.png") // lamp-off.png 이름의 이미지를 imgOn 변수에 지정합니다.
        imgRemove = UIImage(named: "lamp-remove.png") // lamp-remove.png 이름의 이미지를 imgOn 변수에 지정합니다.
        
        ImageView.image = imgOff // 처음 실행 시 imgOff 에 저장된 이미지, 즉 램프의 불이 꺼져 있는 상태의 이미지를 보여주며 시작
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


    @IBAction func btnResizeImage(_ sender: UIButton) { //확대, 축소 시에 실행될 액션 함수 타입은 버튼 타입
        let scale: CGFloat = 2.0 // scale 이라는 변수의 크기 CGFloat 타입으로 하여 2.0 으로 지정
        var newWidth: CGFloat, newHeight: CGFloat // newWidth 와 newHeight 변수를 CGFloat 타입으로 선언
        
        if (isZoom && !isUse) { // 제거 상태가 아닌 사용 상태인지 확인하고 현재 확대 상태인지 확인
            newWidth = ImageView.frame.width/scale // newWidth(너비 변수)에 이미지의 너비/scale 한 결과 값을 넣음 ( 축소 )
            newHeight = ImageView.frame.height/scale  // newHeight(높이 변수)에 이미지의 높이/scale 한 결과 값을 넣음 ( 축소 )
            ImageView.frame.size = CGSize(width: newWidth, height: newHeight) // 이미지의 크기를 너비는 newWidth ,높이는 new Height 값으로 맞춤
            
            btnResize.setTitle("확대", for: .normal) // 버튼의 이름을 확대로 변경
        }
        else if(!isZoom && !isUse) { // 제거 상태가 아닌 사용 상태인지 확인하고 현재 축소 상태인지 확인
            newWidth = ImageView.frame.width*scale // newWidth(너비 변수)에 이미지의 너비*scale 한 결과 값을 넣음 ( 확대 )
            newHeight = ImageView.frame.height*scale // newHeight(높이 변수)에 이미지의 높이*scale 한 결과 값을 넣음 ( 확대 )
            ImageView.frame.size = CGSize(width: newWidth, height: newHeight) // 이미지의 크기를 너비는 newWidth ,높이는 new Height 값으로 맞춤
            
            btnResize.setTitle("축소", for: .normal) // 버튼의 이름을 축소로 변경
        }
        
        isZoom = !isZoom // 확대를 확인하기 위한 조견변수의 현상태를 반대 상태로 변경
        
    }
    
    @IBAction func switchImageOnOff(_ sender: UISwitch) { // 스위치를 온, 오프( 램프를 온, 오프) 하는데 사용하는 함수
        if (!isUse){ //사용 상태 인지 확인
            if sender.isOn { // 스위치 온 이라는 이벤트 발생 시에
                ImageView.image = imgOn // 이미지를 램프 온 이미지로 변경
            } else { // 스위치 오프 라는 이벤트 발생 시에
                ImageView.image = imgOff // 이미지를 램프 오프 이미지로 변경
            }
        }
    }
    
    
    @IBAction func btnUseImage(_ sender: UIButton) { // 사용, 제거 상태일 때 사용하기 위한 함수
        if(isUse) { // 제거 상태에서 사용 상태로 변경 시
            
            
            if(SwitchOn.isOn){ // 스위치가 온 상태 이면
                ImageView.image = imgOn // 이미지를 램프 온 이미지로 변경
            }
            else{ // 스위치가 오프 상태 이면
                ImageView.image = imgOff // 이미지를 램프 오프 이미지로 변경
            }
            btnUse.setTitle("사용", for: .normal) // 버튼 이름을 사용 으로 변경
            
        }
        else { // 사용 상태에서 제거 상태로 변경 시
            ImageView.image = imgRemove // 이미지를 제거 이미지로 변경
            
            btnUse.setTitle("제거", for: .normal) // 버튼 이름을 제거 로 변경
            
        }
        isUse = !isUse // 사용을 확인하는 조견변수의 현상태를 반대 상태로 변경
        
    }
}

