//
//  ViewController.swift
//  lab07_2
//
//  Created by hallym-de1111 on 2019. 11. 6..
//  Copyright © 2019년 kim. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var lbl: UILabel!
    
    let timeSelector: Selector = #selector(ViewController.currentTime)
    let interval = 1.0
    var dSecond = 0
    var dMinute = 0
    var dHour = 0
    var aSecond: CGFloat = 0.0
    var aMinute: CGFloat = 0.0
    var aHour: CGFloat = 0.0
    var centerX: CGFloat = 0.0
    var centerY: CGFloat = 0.0
    var newX: CGFloat = 0.0
    var newY: CGFloat = 0.0
    var lenSecond: CGFloat = 120.0
    var lenMinute: CGFloat = 100.0
    var lenHour: CGFloat = 80.0
    var widthSecond: CGFloat = 2.0
    var widthMinute: CGFloat = 5.0
    var widthHour: CGFloat = 7.0
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        Timer.scheduledTimer(timeInterval: interval, target: self, selector: timeSelector, userInfo: nil, repeats: true)
        centerX = imgView.frame.width/2
        centerY = imgView.frame.height/2
        let pinch = UIPinchGestureRecognizer(target: self, action: #selector(ViewController.doPinch(_:)))
        self.view.addGestureRecognizer(pinch)
    }
    
    @objc func doPinch(_ pinch: UIPinchGestureRecognizer){
        imgView.transform = imgView.transform.scaledBy(x: pinch.scale, y: pinch.scale)
        pinch.scale = 1
    }

    func drawTime() {
        UIGraphicsBeginImageContext(imgView.frame.size)
        let context = UIGraphicsGetCurrentContext()!
        let brownC = UIColor.brown.cgColor
        context.setLineWidth(2.0)
        context.setStrokeColor(brownC)
        // context.setStrokeColor(UIColor.brown.cgColor)
        context.setFillColor(UIColor.yellow.cgColor)
        let circle = CGRect(x: 1.0, y: 1.0, width: centerX*2-1, height:
            centerY*2-1)
        
        context.fillEllipse(in: circle)
        context.addEllipse(in: circle)
        context.strokePath()
        newX = sin(aHour * 30 * 3.14 / 180) * lenHour + centerX
        newY = centerY - (cos(aHour*30*3.14/180)*lenHour)
        context.setLineWidth(widthHour)
        context.setStrokeColor(UIColor.green.cgColor)
        context.move(to: CGPoint(x: centerX, y: centerY))
        context.addLine(to: CGPoint(x: newX, y: newY))
        context.strokePath()
        newX = sin(aMinute * 6 * 3.14 / 180) * lenMinute + centerX
        newY = centerY - (cos(aMinute*6*3.14/180)*lenMinute)
        context.setLineWidth(widthMinute)
        context.setStrokeColor(UIColor.blue.cgColor)
        context.move(to: CGPoint(x: centerX, y: centerY))
        context.addLine(to: CGPoint(x: newX, y: newY))
        context.strokePath()
        newX = sin(aSecond * 6 * 3.14 / 180) * lenSecond + centerX
        newY = centerY - (cos(aSecond*6*3.14/180)*lenSecond)
        context.setLineWidth(widthSecond)
        context.setStrokeColor(UIColor.red.cgColor)
        context.move(to: CGPoint(x: centerX, y: centerY))
        context.addLine(to: CGPoint(x: newX, y: newY))
        context.strokePath()
        // mark 12
        context.setLineWidth(widthHour)
        context.setStrokeColor(UIColor.black.cgColor)
        context.move(to: CGPoint(x: centerX, y: 0))
        context.addLine(to: CGPoint(x: centerX, y: 10))
        context.strokePath()
        context.setLineWidth(widthHour)
        context.setStrokeColor(UIColor.black.cgColor)
        context.move(to: CGPoint(x: centerX*2, y: centerY))
        context.addLine(to: CGPoint(x: centerX*2-10, y: centerY))
        context.strokePath()
        // mark 6
        context.setLineWidth(widthHour)
        context.setStrokeColor(UIColor.black.cgColor)
        context.move(to: CGPoint(x: centerX, y: centerY*2-10))
        context.addLine(to: CGPoint(x: centerX, y: centerY*2))
        context.strokePath()
        // mark 9
        context.setLineWidth(widthHour)
        context.setStrokeColor(UIColor.black.cgColor)
        context.move(to: CGPoint(x: 0, y: centerY))
        context.addLine(to: CGPoint(x: 10, y: centerY))
        context.strokePath()
        imgView.image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
    }
    
    @objc func currentTime() {
        let date = NSDate()
        let formatter = DateFormatter()
        formatter.dateFormat = "yyyy-MM-dd HH:mm:ss: EEE"
        lbl.text = "현재 시간: " + formatter.string(from: date as Date)
        formatter.dateFormat = "ss"
        dSecond = Int(formatter.string(from: date as Date))!
        aSecond = CGFloat(dSecond)
        formatter.dateFormat = "mm"
        dMinute = Int(formatter.string(from: date as Date))!
        aMinute = CGFloat(dMinute)
        formatter.dateFormat = "HH"
        dHour = Int(formatter.string(from: date as Date))!
        aHour = CGFloat(dHour)
        drawTime()
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

}

