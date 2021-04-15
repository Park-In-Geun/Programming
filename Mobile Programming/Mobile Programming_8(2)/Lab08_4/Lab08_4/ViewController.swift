//
//  ViewController.swift
//  Lab08_4
//
//  Created by hallym-de1111 on 2019. 11. 14..
//  Copyright © 2019년 20145105. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var txtMain: UITextField!
    @IBOutlet weak var imgView: UIImageView!
    var img: UIImage? = UIImage(named: "a01.png")
    var lastPoint: CGPoint!
    var firstPoint: CGPoint!
    var clearPoint: CGPoint!
    var currentPoint: CGPoint!
    var lineSize:CGFloat = 2.0
    var sliderRed1:CGFloat = 0.0
    var sliderGreen1:CGFloat = 0.0
    var sliderBlue1:CGFloat = 0.0
    var lineColor = UIColor.red.cgColor
    var clearColor = UIColor.white.cgColor
    var fillColor = UIColor.blue.cgColor
    var sketchType: Int = 1
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        let myColor = UIColor(displayP3Red: CGFloat(sliderRed1), green: CGFloat(sliderGreen1), blue: CGFloat(sliderBlue1), alpha: 1.0)
        lineColor = myColor.cgColor
        imgView.image = nil
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        let touch = touches.first! as UITouch
        lastPoint = touch.location(in: imgView)
        firstPoint = lastPoint
    }
    
    override func touchesMoved(_ touches: Set<UITouch>, with event: UIEvent?){
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setStrokeColor(lineColor)
        context.setLineCap(CGLineCap.round)
        context.setLineWidth(lineSize)
        let touch = touches.first! as UITouch
        currentPoint = touch.location(in: imgView)
        imgView.image?.draw(in: CGRect(x: 0, y: 0, width: imgView.frame.size.width, height: imgView.frame.size.height))
        if sketchType == 1 {
            context.move(to: CGPoint(x: lastPoint.x, y: lastPoint.y))
            context.addLine(to: CGPoint(x: currentPoint.x, y:currentPoint.y))
            context.strokePath()
        }
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
        clearPoint = currentPoint
        lastPoint = currentPoint
    }
    override func touchesEnded(_ touches: Set<UITouch>, with event: UIEvent?) {
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        context.setStrokeColor(lineColor)
        context.setLineCap(CGLineCap.round)
        context.setLineWidth(lineSize)
        
        imgView.image?.draw(in: CGRect(x: 0, y: 0, width: imgView.frame.size.width, height: imgView.frame.size.height))
        
        if sketchType == 1 {
            context.move(to: CGPoint(x: lastPoint.x, y: lastPoint.y))
            context.addLine(to: CGPoint(x: lastPoint.x, y: lastPoint.y))
        } else if sketchType == 2 {
           context.move(to: CGPoint(x: firstPoint.x, y: firstPoint.y))
            context.addLine(to: CGPoint(x: lastPoint.x, y: lastPoint.y))
        } else if sketchType == 3 {
            let ractangle = CGRect(x: firstPoint.x, y: firstPoint.y, width: (lastPoint.x-firstPoint.x), height: (lastPoint.y-firstPoint.y))
            context.addRect(ractangle)
        }
        else if sketchType == 4 {
            let cicle = CGRect(x: firstPoint.x, y: firstPoint.y, width:
                (lastPoint.x-firstPoint.x), height: (lastPoint.y-firstPoint.y))
            context.addEllipse(in: cicle)
        }
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
    }
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        let str = txtMain.text!
        let editVC = segue.destination as! SecondViewController
        if segue.identifier == "editButton" {
            editVC.bufferEdit = "Button 2:" + str
            editVC.img2 = img
        } else if segue.identifier == "editBarButton" {
            editVC.bufferEdit = "BarButton 1" + str
            editVC.img2 = img
        }
    }
}

