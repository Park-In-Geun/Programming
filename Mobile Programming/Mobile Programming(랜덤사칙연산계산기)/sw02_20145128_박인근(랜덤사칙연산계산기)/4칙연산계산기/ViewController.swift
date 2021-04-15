//
//  ViewController.swift
//  4칙연산계산기
//
//  Created by hallym-de1111 on 2019. 9. 25..
//  Copyright © 2019년 Kim. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var txtNum1: UITextField!
    @IBOutlet var txtNum2: UITextField!
    @IBOutlet var txtOperator: UITextField!
    @IBOutlet var txtInsert: UITextField!
    @IBOutlet var txtResult: UITextField!
    @IBOutlet var txtCollect: UITextField!
 
    
    var rst : Int!
    var Randomnum1 : Int!
    var Randomnum2 : Int!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
 
    }
    
    @IBAction func btnAdd(_ sender: UIButton) {
        txtNum1.text! = ""
        txtNum2.text! = ""
        txtOperator.text = "+"
        Randomnum1 = Int(arc4random_uniform(UInt32(100)))
        Randomnum2 = Int(arc4random_uniform(UInt32(100)))
        txtNum1.text = txtNum1.text! + "\(Randomnum1!)"
        txtNum2.text = txtNum2.text! + "\(Randomnum2!)"
        rst = Randomnum1 + Randomnum2
        txtResult.text! = ""
        txtCollect.text! = ""
    }
    
    @IBAction func btnSub(_ sender: UIButton) {
        txtNum1.text! = ""
        txtNum2.text! = ""
        txtOperator.text = "-"
        Randomnum1 = Int(arc4random_uniform(UInt32(100)))
        Randomnum2 = Int(arc4random_uniform(UInt32(100)))
        txtNum1.text = txtNum1.text! + "\(Randomnum1!)"
        txtNum2.text = txtNum2.text! + "\(Randomnum2!)"
        rst = Randomnum1 - Randomnum2
        txtResult.text! = ""
        txtCollect.text! = ""
    }
    
    
    @IBAction func btnMul(_ sender: UIButton) {
        txtNum1.text! = ""
        txtNum2.text! = ""
        txtOperator.text = "*"
        Randomnum1 = Int(arc4random_uniform(UInt32(100)))
        Randomnum2 = Int(arc4random_uniform(UInt32(100)))
        txtNum1.text = txtNum1.text! + "\(Randomnum1!)"
        txtNum2.text = txtNum2.text! + "\(Randomnum2!)"
        rst = Randomnum1 * Randomnum2
        txtResult.text! = ""
        txtCollect.text! = ""
    }
    
    
    @IBAction func btnDiv(_ sender: UIButton) {
        txtNum1.text! = ""
        txtNum2.text! = ""
        txtOperator.text = "/"
        Randomnum1 = Int(arc4random_uniform(UInt32(100)))
        Randomnum2 = Int(arc4random_uniform(UInt32(100)))
        txtNum1.text = txtNum1.text! + "\(Randomnum1!)"
        txtNum2.text = txtNum2.text! + "\(Randomnum2!)"
        rst = Randomnum1 / Randomnum2
        txtResult.text! = ""
        txtCollect.text! = ""
    }
    
    
    @IBAction func btnEqual(_ sender: UIButton) {
        txtResult.text! = ""
        txtCollect.text! = ""
        if txtOperator.text! == "+"{
            txtResult.text = txtResult.text! + "\(rst!)"
        }
        else if txtOperator.text! == "-"{
            txtResult.text = txtResult.text! + "\(rst!)"
        }
        else if txtOperator.text! == "*"{
            txtResult.text = txtResult.text! + "\(rst!)"
        }
        else if txtOperator.text! == "/"{
            txtResult.text = txtResult.text! + "\(rst!)"
        }
        
        if txtInsert.text! == txtResult.text!{
            txtCollect.text = txtCollect.text! + "정답입니다!"
        }
        else if txtInsert.text! != txtResult.text!{
            txtCollect.text = txtCollect.text! + "오답입니다!"
        }
        
    }
    
    
    @IBAction func btnClear(_ sender: UIButton) {
        txtNum1.text! = ""
        txtNum2.text! = ""
        txtOperator.text! = ""
        txtInsert.text! = ""
        txtResult.text! = ""
        txtCollect.text! = ""
    }
    
}

