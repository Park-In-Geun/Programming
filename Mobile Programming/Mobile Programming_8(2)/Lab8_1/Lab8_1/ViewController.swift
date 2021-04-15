//
//  ViewController.swift
//  Lab8_1
//
//  Created by hallym-de1111 on 2019. 11. 13..
//  Copyright © 2019년 20145105. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var segChange: UISegmentedControl!
    @IBOutlet var lbl: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    @IBAction func btnGoSecond(_ sender: UIButton) {
        tabBarController?.selectedIndex = 1
    }
    
    @IBAction func btnGoThird(_ sender: UIButton) {
        tabBarController?.selectedIndex = 2
    }
    
    @IBAction func btn1(_ sender: UIButton) {
        lbl.text = "화면 1: 첫번째화면입니다."
    }
    
    @IBAction func SegChanged(_ sender: UISegmentedControl) {
        if segChange.selectedSegmentIndex == 0 {
            tabBarController?.selectedIndex = 1
        }
        else {
            tabBarController?.selectedIndex = 2
        }
    }
    
    
}

