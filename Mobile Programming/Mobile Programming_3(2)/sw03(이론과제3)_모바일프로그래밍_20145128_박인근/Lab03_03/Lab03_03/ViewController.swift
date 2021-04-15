//
//  ViewController.swift
//  Lab03_03
//
//  Created by hallym-de1111 on 2019. 10. 1..
//  Copyright © 2019년 jspark. All rights reserved.
//

import UIKit
var familyImg = ["가족사진1.jpeg","가족사진2.jpg","가족사진3.jpg"]
var friendImg = ["친구사진1.jpg","친구사진2.jpg","친구사진3.jpg"]

class ViewController: UIViewController {
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var pageControl: UIPageControl!
    @IBOutlet var segControl: UISegmentedControl!
    var bool = false
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        pageControl.numberOfPages = familyImg.count
        pageControl.currentPage = 0
        pageControl.pageIndicatorTintColor = UIColor.red
        pageControl.currentPageIndicatorTintColor = UIColor.green
        
        imgView.image = UIImage(named: familyImg[0])
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @IBAction func pageChanged(_ sender: UIPageControl) {
        if bool == false{
            imgView.image = UIImage(named: familyImg[pageControl.currentPage])
        }
        else{
            imgView.image = UIImage(named: friendImg[pageControl.currentPage])
        }
    }
    
    
    @IBAction func SegChanged(_ sender: UISegmentedControl) {
        if sender.selectedSegmentIndex == 0{
            bool = false
            pageControl.numberOfPages = familyImg.count
            pageControl.currentPage = 0
            pageControl.pageIndicatorTintColor = UIColor.red
            pageControl.currentPageIndicatorTintColor = UIColor.green
            
            imgView.image = UIImage(named: familyImg[0])
        }
        else if sender.selectedSegmentIndex == 1{
            bool = true
            pageControl.numberOfPages = friendImg.count
            pageControl.currentPage = 0
            pageControl.pageIndicatorTintColor = UIColor.red
            pageControl.currentPageIndicatorTintColor = UIColor.green
            
            imgView.image = UIImage(named: friendImg[0])
        }
    }
    
}

