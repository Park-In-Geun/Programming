//
//  LakeView.swift
//  TableViewLab
//
//  Created by hallym-de1111 on 2019. 12. 5..
//  Copyright © 2019년 20145128. All rights reserved.
//

import UIKit

class LakeView: UIViewController {
    @IBOutlet var txtView: UITextView!
    var sName = ""
    var Score = 0.0
    
    override func viewDidLoad() {
        super.viewDidLoad()
        Score = (countW / Double(gamecount)) * 100
        
        // Do any additional setup after loading the view.
        txtView.text = String(sName) + "의 승률 : " + String(Score) + "%\n"
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
