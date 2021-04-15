//
//  ViewController.swift
//  Lab06_2
//
//  Created by hallym-de1111 on 2019. 10. 30..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var sliRed: UISlider!
    @IBOutlet var sliBlue: UISlider!
    @IBOutlet var sliGreen: UISlider!
    
    var red : CGFloat = 0.0
    var blue : CGFloat = 0.0
    var green : CGFloat = 0.0
    
    var checkLine = false
    var checkCircle = false
    var checkRect = false
    var checkFill = false
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        

        sliRed.minimumValue = 0.0
        sliGreen.minimumValue = 0.0
        sliGreen.minimumValue = 0.0
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    @IBAction func btnLine(_ sender: UIButton) {
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setStrokeColor(UIColor.red.cgColor)
        context.move(to: CGPoint(x: 100, y: 100))
        context.addLine(to: CGPoint(x: 250, y: 250))
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
        checkLine = true
        checkCircle = false
        checkRect = false
        checkFill = false
    }
    
    @IBAction func btnRect(_ sender: UIButton) {
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setStrokeColor(UIColor.red.cgColor)
        context.addRect(CGRect(x: 50, y: 100, width: 200, height: 200))
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
        checkLine = false
        checkCircle = false
        checkRect = true
        checkFill = false
    }
    
    @IBAction func btnCircle(_ sender: UIButton) {
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setStrokeColor(UIColor.red.cgColor)
        context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
        checkLine = false
        checkCircle = true
        checkRect = false
        checkFill = false
    }
    
    @IBAction func btnFill(_ sender: UIButton) {
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setFillColor(UIColor.blue.cgColor)
        context.fillEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        context.setStrokeColor(UIColor.red.cgColor)
        context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
        checkLine = false
        checkCircle = false
        checkRect = false
        checkFill = true
    }
    @IBAction func ChagneRed(_ sender: UISlider) {
        red = CGFloat(sliRed.value)
        blue = CGFloat(sliBlue.value)
        green = CGFloat(sliGreen.value)
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setStrokeColor(red: red, green: green, blue: blue, alpha: 1.0)
        if checkLine {
            context.move(to: CGPoint(x: 100, y: 100))
            context.addLine(to: CGPoint(x: 250, y: 250))
        }
        else if checkRect{
            context.addRect(CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        else if checkCircle{
            context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        else if checkFill{
            context.setFillColor(red: red, green: green, blue: blue, alpha: 1.0)
            context.fillEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
            context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
    }
    
    @IBAction func ChangeBlue(_ sender: UISlider) {
        red = CGFloat(sliRed.value)
        blue = CGFloat(sliBlue.value)
        green = CGFloat(sliGreen.value)
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setStrokeColor(red: red, green: green, blue: blue, alpha: 1.0)
        if checkLine {
            context.move(to: CGPoint(x: 100, y: 100))
            context.addLine(to: CGPoint(x: 250, y: 250))
        }
        else if checkRect{
            context.addRect(CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        else if checkCircle{
            context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        else if checkFill{
            context.setFillColor(red: red, green: green, blue: blue, alpha: 1.0)
            context.fillEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
            context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
    }
    
    @IBAction func ChagneGreen(_ sender: UISlider) {
        red = CGFloat(sliRed.value)
        blue = CGFloat(sliBlue.value)
        green = CGFloat(sliGreen.value)
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setLineWidth(2.0)
        context.setStrokeColor(red: red, green: green, blue: blue, alpha: 1.0)
        if checkLine {
            context.move(to: CGPoint(x: 100, y: 100))
            context.addLine(to: CGPoint(x: 250, y: 250))
        }
        else if checkRect{
            context.addRect(CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        else if checkCircle{
            context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        else if checkFill{
            context.setFillColor(red: red, green: green, blue: blue, alpha: 1.0)
            context.fillEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
            context.addEllipse(in: CGRect(x: 50, y: 100, width: 200, height: 200))
        }
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
    }
    
    
}

