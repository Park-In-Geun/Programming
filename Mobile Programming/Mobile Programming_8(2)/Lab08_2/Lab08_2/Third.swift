//
//  ViewController.swift
//  Week9
//
//  Created by hallym-de1111 on 2019. 11. 6..
//  Copyright © 2019년 kim. All rights reserved.
//

import UIKit

var animals = ["a01.png","a02.png","a03.png","a04.png","a05.png","a06.png","a07.png","a08.png","a09.png","a01.png"]
// 동물 이미지

var flower = ["01.png","02.png","03.png","04.png","05.png","06.png","07.png","08.png","09.png","01.png"]
// 꽃 이미지

class Third: UIViewController {
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var pageControl: UIPageControl!
    @IBOutlet var sliRed: UISlider!
    @IBOutlet var sliGreen: UISlider!
    @IBOutlet var sliBlue: UISlider!
    @IBOutlet var btnAnimal: UIButton!
    @IBOutlet var btnFlower: UIButton!
    
    var check = false // 동물 이미지를 보여줄 것인지, 꽃 이미지를 보여줄 것인지 확인하기 위한 변수
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        pageControl.numberOfPages = animals.count
        pageControl.currentPage = 0
        pageControl.pageIndicatorTintColor = UIColor.green
        pageControl.currentPageIndicatorTintColor = UIColor.red
        imgView.image = UIImage(named: animals[0])
        // 초기 이미지를 동물 이미지로 , 현재 페이지 컨트롤 색상을 빨강, 전체 페이지 컨트롤 색상을 초록으로 지정
        
        sliRed.value = 0 // 빨강 슬라이더 값을 0으로 초기화
        sliGreen.value = 0 // 초록 슬라이더 값을 0으로 초기화
        sliBlue.value = 0 // 파랑 슬라이더 값을 0으로 초기화
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func btnAnimal(_ sender: UIButton) { // 동물 버튼 선택 함수
        check = false // flase 시 동물 이미지를 보여줌
        imgView.image = UIImage(named: animals[pageControl.currentPage])
        // 이미지 뷰에 현재 페이지 컨트롤 순서의 동물 이미지를 보여줌
    }
    
    @IBAction func btnFlower(_ sender: UIButton) {
        check = true // true 시 꽃 이미지를 보여줌
        imgView.image = UIImage(named: flower[pageControl.currentPage])
        // 이미지 뷰에 현재 페이지 컨트롤 순서의 꽃 이미지를 보여줌
    }
    
    @IBAction func sliRedChange(_ sender: UISlider) { // 빨강 슬라이더 변경 함수
        let red = CGFloat(sliRed.value) // 페이지 컨트롤의 current 색의 빨간색 부분을 변경시켜주기 위한 변수
        let green = CGFloat(sliGreen.value) // 페이지 컨트롤의 current 색의 초록색 부분을 변경시켜주기 위한 변수
        let blue = CGFloat(sliBlue.value) // 페이지 컨트롤의 current 색의 파란색 부분을 변경시켜주기 위한 변수
        let myColor = UIColor(red: red, green: green, blue: blue, alpha: 1)
        // 페이지 컨트롤의 current R,G,B 색을 종합하여 지정해주는 변수
        pageControl.currentPageIndicatorTintColor = myColor // 페이지 컨트롤의 current 페이지를 myColor 색으로 지정
        
    }
    
    @IBAction func sliGreenChange(_ sender: UISlider) { // 초록 슬라이더 변경 함수
        let red = CGFloat(sliRed.value) // 페이지 컨트롤의 current 색의 빨간색 부분을 변경시켜주기 위한 변수
        let green = CGFloat(sliGreen.value) // 페이지 컨트롤의 current 색의 초록색 부분을 변경시켜주기 위한 변수
        let blue = CGFloat(sliBlue.value) // 페이지 컨트롤의 current 색의 파란색 부분을 변경시켜주기 위한 변수
        let myColor = UIColor(red: red, green: green, blue: blue, alpha: 1)
        // 페이지 컨트롤의 current R,G,B 색을 종합하여 지정해주는 변수
        pageControl.currentPageIndicatorTintColor = myColor // 페이지 컨트롤의 current 페이지를 myColor 색으로 지정
    }
    
    @IBAction func sliBlueChange(_ sender: UISlider) { // 파랑 슬라이더 변경 함수
        let red = CGFloat(sliRed.value) // 페이지 컨트롤의 current 색의 빨간색 부분을 변경시켜주기 위한 변수
        let green = CGFloat(sliGreen.value) // 페이지 컨트롤의 current 색의 초록색 부분을 변경시켜주기 위한 변수
        let blue = CGFloat(sliBlue.value) // 페이지 컨트롤의 current 색의 파란색 부분을 변경시켜주기 위한 변수
        let myColor = UIColor(red: red, green: green, blue: blue, alpha: 1)
        // 페이지 컨트롤의 current R,G,B 색을 종합하여 지정해주는 변수
        pageControl.currentPageIndicatorTintColor = myColor // 페이지 컨트롤의 current 페이지를 myColor 색으로 지정
        
    }
    
    
    @IBAction func pageChanged(_ sender: UIPageControl) {
        if check == false{
            imgView.image = UIImage(named: animals[pageControl.currentPage]) // check 가 flase 시 동물 이미지를 이미지 뷰에 출력
        }
        else if check == true{
            imgView.image = UIImage(named: flower[pageControl.currentPage]) // check 가 true 시 꽃 이미지를 이미지 뷰에 출력
        }
    }
}

