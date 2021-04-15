//
//  ViewController.swift
//  Lab08_3
//
//  Created by hallym-de1111 on 2019. 11. 14..
//  Copyright © 2019년 20145105. All rights reserved.
//

import UIKit

class ViewController: UIViewController, EditDelegate {
    @IBOutlet weak var imgView: UIImageView!
    @IBOutlet weak var txtView: UITextField!
    let imgOn = UIImage(named: "lamp-on.png")
    let imgOff = UIImage(named: "lamp-off.png")
    var isOn = true
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        imgView.image = imgOn
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        let editViewController = segue.destination as! NaviViewController
        
        if segue.identifier == "editButton" {
            editViewController.textWayValue = "segue : use Button"
        }
        else if segue.identifier == "editBarButton" {
            editViewController.textWayValue = "segue : use bar button"
        }
        
        editViewController.textMessage = txtView.text!
        editViewController.isOn = isOn
        editViewController.delegate = self
    }

    func MessageEditDone(_ controller: NaviViewController, message: String){
        txtView.text = message
    }

    func LampOnOff(_ controller: NaviViewController, isOn: Bool){
        if isOn{
            imgView.image = imgOn
        }else{
            imgView.image = imgOff
            self.isOn = false
        }
    }
    
    
}

