//
//  ViewController.swift
//  Lab05_Animation
//
//  Created by hallym-de1111 on 2019. 10. 22..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var imgView: UIImageView!
    var imgArray = [UIImage?]()
    var imgFileName = ["xmas01.png","xmas02.png","xmas03.png","xmas04.png","xmas05.png","xmas06.png","xmas07.png","xmas08.png","xmas09.png","xmas10.png","xmas11.png","xmas12.png","xmas13.png","xmas14.png","xmas15.png","xmas16.png"]
    
    var cnt = 0
    var k = 0
    let timeSelector: Selector = #selector(ViewController.aniImage)
    let interval = 2.0
    
    @objc func aniImage() {
        
        imgView.image = imgArray[cnt]
        cnt = cnt + 1
        
        if cnt == 16 {
            cnt = 0
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        for k in 0 ... 15 {
            let image = UIImage(named: imgFileName[k])
            imgArray.append(image)
            Timer.scheduledTimer(timeInterval: interval, target: self, selector: timeSelector, userInfo: nil, repeats: true)
        }
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

