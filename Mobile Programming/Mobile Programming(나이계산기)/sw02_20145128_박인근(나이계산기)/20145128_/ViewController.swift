//
//  ViewController.swift
//  20145128_
//
//  Created by hallym-de1111 on 2019. 9. 23..
//  Copyright © 2019년 Kim. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var lbl: UILabel!
    @IBOutlet var yearTF: UITextField!
    @IBOutlet var monthTF: UITextField!
    @IBOutlet var dayTF: UITextField!
    var check = false
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
  
    @IBAction func btn(_ sender: UIButton) {
        let date = NSDate()
        
        //년
        let yearForm = DateFormatter()
        yearForm.dateFormat = "yyyy"
        let year = yearForm.string(from: date as Date)
        var yearCurrent = Int(year)!
        let yearYour = Int(yearTF.text!)!
        
        //월
        let monthForm = DateFormatter()
        monthForm.dateFormat = "MM"
        let month = monthForm.string(from: date as Date)
        var monthCurrent = Int(month)!
        let monthYour = Int(monthTF.text!)!
        
        //일
        let dayForm = DateFormatter()
        dayForm.dateFormat = "dd"
        let day = dayForm.string(from: date as Date)
        var dayCurrent = Int(day)!
        let dayYour = Int(dayTF.text!)!
        
        lbl.text = ""
        yearCurrent = yearCurrent - yearYour
        
        switch (monthCurrent) {
        case 1,3,5,7,8,10,12:
            if Int(dayTF.text!)! > 31{
                lbl.text = "날짜가 제대로 입력되지 않았습니다."
                check = true
            }
            else{
                check = false
            }
        case 4,6,9,11:
            if Int(dayTF.text!)! > 30 {
                lbl.text = "날짜가 제대로 입력되지 않았습니다."
                check = true
            }
            else{
                check = false
            }
        default:
            if Int(dayTF.text!)! > 28 {
                lbl.text = "날짜가 제대로 입력되지 않았습니다."
                check = true
            }
            else{
                check = false
            }
        }
        
        
        if monthCurrent - monthYour < 0
        {
            monthCurrent = monthCurrent - monthYour + 12
            yearCurrent = yearCurrent - 1
        }
        else{
            monthCurrent = monthCurrent - monthYour
        }
        if dayCurrent - dayYour < 0 {
            dayCurrent = dayCurrent - dayYour
            switch(monthCurrent){
            case 1,3,5,7,8,10,12 :
            
                dayCurrent = dayCurrent + 31
            case 4,6,9,11 :
               
                dayCurrent = dayCurrent + 30
            default:
               
                dayCurrent = dayCurrent + 28
            }
            monthCurrent = monthCurrent - 1
        }
        else{
            dayCurrent = dayCurrent - dayYour
        }
        
        if yearCurrent < 0 || monthCurrent < 0 || dayCurrent < 0 {
            lbl.text = "태어나지 않았습니다. 확인 후 다시 입력해 주세요."
        }
        
        if check == false{
            lbl.text = lbl.text! + "당신의 정확한 나이는 \(yearCurrent)년 \(monthCurrent)개월 \(dayCurrent)일 입니다."
        }
        
    }
}

