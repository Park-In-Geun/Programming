//
//  DetailVC.swift
//  TableViewLab
//
//  Created by hallym-de1111 on 2019. 11. 27..
//  Copyright © 2019년 20145128. All rights reserved.
//

import UIKit
import GameplayKit //랜덤 코드를 쓰기 위한 import

class DetailVC: UIViewController {
    var playerW = ""
    var computerW = ""
    var comImage = UIImage()

    let randomSource = GKARC4RandomSource() //랜덤한 숫자를 만드는 객체 만들기

    @IBOutlet var playerView: UIImageView!
    @IBOutlet var comView: UIImageView!
    @IBOutlet var playerTxt: UITextField!
    @IBOutlet var comTxt: UITextField!
    @IBOutlet var winTxt: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        playerTxt.text = "플레이어 : " + playerW
        if playerW == "가위"{
            playerView.image = UIImage(named: "scissors.png")
        }
        else if playerW == "바위"{
            playerView.image = UIImage(named: "rock.png")
        }
        else{
            playerView.image = UIImage(named: "paper.png")
        }
        
        let computer = randomSource.nextInt(upperBound:3)
        
        switch computer {
        case 0 :
            comView.image = UIImage(named: "scissors.png")
            comTxt.text = "컴퓨터 : 가위"
            switch playerW{
            case "가위" :
                winTxt.text = "플레이어와 컴퓨터가 비겼습니다."
                break
            case "바위" :
                winTxt.text = "플레이어가 이겼습니다."
                break
            default :
                winTxt.text = "플레이어가 졌습니다."
                break
            }
        case 1 :
            comView.image = UIImage(named: "rock.png")
            comTxt.text = "컴퓨터 : 바위"
            switch playerW{
            case "가위" :
                winTxt.text = "플레이어가 졌습니다."
                break
            case "바위" :
                winTxt.text = "플레이어와 컴퓨터가 비겼습니다."
                break
            default :
                winTxt.text = "플레이어가 이겼습니다."
                break
            }
        default:
            comView.image = UIImage(named: "paper.png")
            comTxt.text = "컴퓨터 : 보"
            switch playerW{
            case "가위" :
                winTxt.text = "플레이어가 이겼습니다."
                break
            case "바위" :
                winTxt.text = "플레이어가 졌습니다."
                break
            default :
                winTxt.text = "플레이어와 컴퓨터가 비겼습니다."
                break
            }
        }
        
        if winTxt.text == "플레이어가 이겼습니다."{
            countW = countW + 1
            gamecount = gamecount + 1
        }
        else if winTxt.text == "플레이어와 컴퓨터가 비겼습니다."{
            gamecount = gamecount + 1
        }
        else {
            gamecount = gamecount + 1
        }
        // Do any additional setup after loading the view.
    }

    func getDetail(_ playerK: String){
        playerW = playerK
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
