//
//  ViewController.swift
//  Lab08_3
//
//  Created by hallym-de1111 on 2019. 11. 14..
//  Copyright © 2019년 20145105. All rights reserved.
//

import UIKit

protocol EditDelegate{
    func MessageEditDone(_ controller: NaviViewController, message: String)
    
    func LampOnOff(_ controller: NaviViewController, isOn: Bool)
}


class NaviViewController: UIViewController{
    
    var isOn = false
    
    @IBOutlet weak var swOnOffBtn: UISwitch!
    
    var delegate : EditDelegate?
    
    @IBOutlet weak var txtView: UITextField!
    @IBOutlet weak var lbl: UILabel!
    
    var textWayValue: String = ""
    var textMessage: String = ""
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        lbl.text = textWayValue
        txtView.text = textMessage
        swOnOffBtn.isOn = isOn
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func btnDone(_ sender: UIButton) {
        
        if delegate != nil{
            delegate?.MessageEditDone(self, message: txtView.text!)
            delegate?.LampOnOff(self, isOn: isOn)
        }
        _ = navigationController?.popViewController(animated: true)
    }
    
    @IBAction func swImageOnOff(_ sender: UISwitch) {
        if sender.isOn {
            isOn = true
        }else{
            isOn = false
        }
    }
    
}

