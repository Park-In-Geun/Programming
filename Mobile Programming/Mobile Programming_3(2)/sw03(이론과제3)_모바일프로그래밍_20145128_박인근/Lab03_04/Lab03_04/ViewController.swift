//
//  ViewController.swift
//  Lab03_04
//
//  Created by hallym-de1111 on 2019. 10. 1..
//  Copyright © 2019년 jspark. All rights reserved.
//

import UIKit
var image = ["가족사진1.jpeg","가족사진2.jpg","가족사진3.jpg","친구사진1.jpg","친구사진2.jpg","친구사진3.jpg"]

class ViewController: UIViewController {
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var slider: UISlider!
    @IBOutlet var pageControl: UIPageControl!
    let sliserMax:CGFloat = 2.0
    let sliserMin:CGFloat = -2.0
    var scale:CGFloat = 2.0
    var orgWidth:CGFloat = 1.0
    var orgHeight:CGFloat = 1.0
    var isZoom = false
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        pageControl.numberOfPages = image.count
        pageControl.currentPage = 0
        pageControl.pageIndicatorTintColor = UIColor.green
        pageControl.currentPageIndicatorTintColor = UIColor.red
        imgView.image = UIImage(named: image[0])
        slider.maximumValue = 2.0
        slider.minimumValue = 0.0
        slider.value = 1.0
        orgWidth = imgView.frame.width
        orgHeight = imgView.frame.height
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @IBAction func SliderChange(_ sender: UISlider) {
        scale = CGFloat(slider.value)
        var newWidth: CGFloat, newHeight:CGFloat
        
        if isZoom{
            newWidth = orgWidth/scale
            newHeight = orgHeight/scale
            imgView.frame.size = CGSize(width: newWidth, height: newHeight)
        }else{
            newWidth = orgWidth*scale
            newHeight = orgHeight*scale
            imgView.frame.size = CGSize(width: newWidth, height: newHeight)
        }
    }
    
    @IBAction func PageChange(_ sender: UIPageControl) {
        imgView.image = UIImage(named: image[pageControl.currentPage])
    }
    
    
}

