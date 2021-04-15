//
//  ViewController.swift
//  Lab8_1
//
//  Created by hallym-de1111 on 2019. 11. 13..
//  Copyright © 2019년 20145105. All rights reserved.
//

import UIKit

class ThirdVC: UIViewController {
    @IBOutlet var lbl: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func btn1(_ sender: UIButton) {
        lbl.text = "화면 3: 세번째화면입니다."
    }
    

}

