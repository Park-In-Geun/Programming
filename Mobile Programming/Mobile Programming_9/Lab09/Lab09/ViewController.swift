//
//  ViewController.swift
//  Lab09
//
//  Created by hallym-de1111 on 2019. 11. 20..
//  Copyright © 2019년 Hallym. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var txtView: UITextField!
    @IBOutlet weak var txtList: UITextView!
    
    var dic = ["산":"01.png","절벽":"02.png","강":"03.png","눈":"04.png","폭포":"05.png","물개":"a01.png","병아리":"a02.png","강아지":"a03.png","곰":"a04.png","물범":"a05.png"]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        txtList.text = "--- 검색 가능한 목록 ---\n"
        for (key , _) in dic{
            txtList.text = txtList.text! + "\(key)\n"
        }
    
    }

    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        
        let DicVC = segue.destination as! DicView
       DicVC.str = txtView.text!
        
    }
}

