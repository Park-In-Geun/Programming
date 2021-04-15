//
//  ViewController.swift
//  Lab05_Video
//
//  Created by hallym-de1111 on 2019. 10. 22..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit
import AVKit

class ViewController: UIViewController {
    

    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func btnIn(_ sender: UIButton) {
        let videoFile:String? = Bundle.main.path(forResource: "a", ofType: "mp4")
        
        let urlVideo = NSURL(fileURLWithPath: videoFile!)
       
        let videoPlayerController = AVPlayerViewController()
       
        let videoPlayer = AVPlayer(url: urlVideo as URL)
        
        videoPlayerController.player = videoPlayer
        self.present(videoPlayerController, animated: true) { videoPlayer.play()}
        
    }
    
    @IBAction func btnOut(_ sender: UIButton) {
        let urlVideo = NSURL(string: "https://ak4.picdn.net/shutterstock/videos/1027693934/preview/stock-footage-dad-hands-holding-spinning-little-happy-smiling-cute-son-playing-together-at-nature-countryside-pov.mp4")!
        
        
        let videoPlayerController = AVPlayerViewController()
        
        let videoPlayer = AVPlayer(url: urlVideo as URL)
        
        videoPlayerController.player = videoPlayer
        
        self.present(videoPlayerController, animated: true) { videoPlayer.play()
        }
        
    }
}

