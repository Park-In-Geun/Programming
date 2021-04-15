//
//  ViewController.swift
//  Lab08_4
//
//  Created by hallym-de1111 on 2019. 11. 14..
//  Copyright © 2019년 20145105. All rights reserved.
//

import UIKit

protocol EditDelegate {
    func fooSetLineColor(_ red2: CGFloat, green2: CGFloat, blue2: CGFloat)
    func fooSetLineWidth(_ width2: CGFloat)
    
}

class SecondViewController: UIViewController {
    @IBOutlet weak var lblEdit: UILabel!
    @IBOutlet weak var sliderWidth: UISlider!
    @IBOutlet weak var sliderRed2: UISlider!
    @IBOutlet weak var sliderGreen2: UISlider!
    @IBOutlet weak var sliderBlue2: UISlider!
    var bufferEdit: String = ""
    var img2:UIImage? = UIImage(named: "03.png")
    var sketchType2: Int = 1
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        sliderWidth.maximumValue = 10.0
        sliderWidth.minimumValue = 0.0
        sliderWidth.value = 2.0
        sliderRed2.maximumValue = 1.0
        sliderRed2.minimumValue = 0.0
        sliderRed2.value = 0.5
        sliderGreen2.maximumValue = 1.0
        sliderGreen2.minimumValue = 0.0
        sliderGreen2.value = 0.5
        sliderBlue2.maximumValue = 1.0
        sliderBlue2.minimumValue = 0.0
        sliderBlue2.value = 0.5
        lblEdit.text = bufferEdit
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?){
        let viewController = segue.destination as! ViewController
        if segue.identifier == "mainButton" {
            viewController.img = img2
            viewController.lineSize = CGFloat(sliderWidth.value)
            viewController.sliderRed1 = CGFloat(sliderRed2.value)
            viewController.sliderGreen1 = CGFloat(sliderGreen2.value)
            viewController.sliderGreen1 = CGFloat(sliderGreen2.value)
            viewController.sketchType = sketchType2
        }
    }
    @IBAction func btn(_ sender: UIButton) {
        sketchType2 = 1
    }
    @IBAction func btnLine(_ sender: UIButton) {
        sketchType2 = 2
    }
    @IBAction func btnRect(_ sender: UIButton) {
        sketchType2 = 3
    }
    @IBAction func btnCircle(_ sender: UIButton) {
        sketchType2 = 4
    }
    @IBAction func btnDone(_ sender: UIButton) {
        _ = navigationController?.popViewController(animated: true)
    }
    
    
    
}

