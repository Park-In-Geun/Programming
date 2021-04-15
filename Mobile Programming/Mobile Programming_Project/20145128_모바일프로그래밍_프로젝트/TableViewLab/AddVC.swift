//
//  AddVC.swift
//  TableViewLab
//
//  Created by hallym-de1111 on 2019. 11. 27..
//  Copyright © 2019년 20145128. All rights reserved.
//

import UIKit


class AddVC: UIViewController {
    @IBOutlet var txtName: UITextField!
    @IBOutlet var txtScore: UITextField!
    @IBOutlet var txtGame: UITextField!
    var sName = ""
    
    override func viewDidLoad() {
        super.viewDidLoad()
        txtScore.text = String(countW)
        txtGame.text = String(gamecount)
        // Do any additional setup after loading the view.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?)
    {
        let lankView = segue.destination as! LakeView
        if segue.identifier == "sgSend" {
            lankView.sName = txtName.text!
        }
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
