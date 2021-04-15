//
//  ViewController.swift
//  Lab03
//
//  Created by hallym-de1111 on 2019. 10. 1..
//  Copyright © 2019년 jspark. All rights reserved.
//

import UIKit
var lbl = ["컴퓨터", "빅데이터", "IoT", "컨텐츠 IT", "전자공학"]

class ViewController: UIViewController {
    @IBOutlet var pageControl: UIPageControl!
    @IBOutlet var label: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        pageControl.numberOfPages = lbl.count
        pageControl.currentPage = 0
        pageControl.pageIndicatorTintColor = UIColor.blue
        pageControl.currentPageIndicatorTintColor = UIColor.black
        label.text = "Current : " + lbl[0]
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    
    @IBAction func pageChanged(_ sender: UIPageControl) {
        label.text = "Current : " + lbl[pageControl.currentPage]
    }
    
}

