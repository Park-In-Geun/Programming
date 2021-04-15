//
//  ViewController.swift
//  20145128_박인근_전구과제
//
//  Created by hallym-de1111 on 2019. 10. 8..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    let imgOn = UIImage(named: "lamp-on.png")
    let imgOff = UIImage(named: "lamp-off.png")
    var isLamp = true
    @IBOutlet var imgView: UIImageView!
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        imgView.image = imgOn
    }


    @IBAction func btnOn(_ sender: UIButton) {
        if (isLamp == true) {
            let onAlert = UIAlertController(title: "경고", message: "현재 켜져있습니다", preferredStyle: UIAlertControllerStyle.alert)
            let onAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
            onAlert.addAction(onAction)
            present(onAlert, animated: true, completion: nil )
        }
        else {
            let onAlert = UIAlertController(title: "램프켜기", message: "켜시겠습니까?", preferredStyle: UIAlertControllerStyle.alert)
            
            let onAction = UIAlertAction(title:"네",style: UIAlertActionStyle.default,                                         handler: {ACTION in self.imgView.image = self.imgOn
                self.isLamp = true
            })
            onAlert.addAction(onAction)
            present(onAlert, animated: true, completion: nil)
        }
    }
    
    
    @IBAction func btnOff(_ sender: UIButton) {
        if isLamp == true {
            let offAlert = UIAlertController(title: "램프끄기", message: "끄시겠습니까?", preferredStyle: UIAlertControllerStyle.alert)
    
            let offAction = UIAlertAction(title:"네",style: UIAlertActionStyle.default,                                         handler: {ACTION in self.imgView.image = self.imgOff
                self.isLamp = false
            })
            offAlert.addAction(offAction)
            present(offAlert, animated: true, completion: nil)
        }
        else{
            let offAlert = UIAlertController(title: "경고", message: "현재 꺼져있습니다", preferredStyle: UIAlertControllerStyle.alert)
            let offAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
            offAlert.addAction(offAction)
            present(offAlert, animated: true, completion: nil )
        }
    }
    
    
    @IBAction func btnRemove(_ sender: UIButton) {
        let RemoveAlert = UIAlertController(title: "경고", message: "제거 상태 클릭하셨습니다.", preferredStyle: UIAlertControllerStyle.alert)
        let RemoveAction = UIAlertAction(title: "네, 알겠습니다.", style: UIAlertActionStyle.default, handler: nil)
        RemoveAlert.addAction(RemoveAction)
        
        present(RemoveAlert, animated: true, completion: nil )
    }
    
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

