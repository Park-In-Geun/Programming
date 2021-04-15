//
//  ViewController.swift
//  Lab09
//
//  Created by hallym-de1111 on 2019. 11. 20..
//  Copyright © 2019년 Hallym. All rights reserved.
//

import UIKit

class DicView: UIViewController {
    var str = ""
    
    @IBOutlet weak var txtView: UITextField!
    @IBOutlet weak var imgView: UIImageView!
    
    var dic = ["산":"01.png","절벽":"02.png","강":"03.png","눈":"04.png","폭포":"05.png","물개":"a01.png","병아리":"a02.png","강아지":"a03.png","곰":"a04.png","물범":"a05.png"]
    var img = UIImage(named: "sunny.jpeg")
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        if let dicval = dic[str] {
            imgView.image = UIImage(named: dicval)
            txtView.text = "검색한 단어 : " + str
        }else{
            imgView.image = img
            txtView.text = "검색한 단어와 일치하는 사진이 없습니다."
        }
    }
    
    

}

