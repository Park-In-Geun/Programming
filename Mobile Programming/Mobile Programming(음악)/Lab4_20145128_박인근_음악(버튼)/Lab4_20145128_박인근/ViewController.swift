//
//  ViewController.swift
//  Lab4_20145128_박인근
//
//  Created by hallym-de1111 on 2019. 10. 8..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit
import AVFoundation

class ViewController: UIViewController {
    var audioPlayer : AVAudioPlayer!
    var audioFile : URL!
    @IBOutlet var volumeSlider: UISlider!

    var musicNames = ["twice_dance_the_night_away", "twice_feel_special", "twice_knock_knock", "twice_yes_or_yes", "twice_fancy"]

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        volumeSlider.maximumValue = 2.0
        volumeSlider.minimumValue = 0.0
        volumeSlider.value = 1.0
        audioFile = Bundle.main.url(forResource: musicNames[0], withExtension: "mp3")
        do{
            audioPlayer = try AVAudioPlayer(contentsOf: audioFile)
        } catch let error as NSError {
            print("Error :\(error)")
        }
        audioPlayer.prepareToPlay()
        audioPlayer.volume = volumeSlider.value
    }
    
    @IBAction func volumeChangedSlider(_ sender: UISlider) {
        audioPlayer.volume = volumeSlider.value
    }
    
    @IBAction func btnPlay01(_ sender: UIButton) {
        audioFile = Bundle.main.url(forResource: musicNames[0], withExtension: "mp3")
        do{
            audioPlayer = try AVAudioPlayer(contentsOf: audioFile)
        }catch let error as NSError {
            print("Error :\(error)")
        }
        audioPlayer.play()
    }
    
    @IBAction func btnPlay02(_ sender: UIButton) {
        audioFile = Bundle.main.url(forResource: musicNames[1], withExtension: "mp3")
        do{
            audioPlayer = try AVAudioPlayer(contentsOf: audioFile)
        }catch let error as NSError {
            print("Error :\(error)")
        }
        audioPlayer.play()
    
    }
    
    @IBAction func btnPlay03(_ sender: UIButton) {
        audioFile = Bundle.main.url(forResource: musicNames[2], withExtension: "mp3")
        do{
            audioPlayer = try AVAudioPlayer(contentsOf: audioFile)
        }catch let error as NSError {
            print("Error :\(error)")
        }
        audioPlayer.play()
    }
    
    @IBAction func btnPlay04(_ sender: UIButton) {
        audioFile = Bundle.main.url(forResource: musicNames[3], withExtension: "mp3")
        do{
            audioPlayer = try AVAudioPlayer(contentsOf: audioFile)
        }catch let error as NSError {
            print("Error :\(error)")
        }
        audioPlayer.play()
    }
    
    @IBAction func btnPlay05(_ sender: UIButton) {
        audioFile = Bundle.main.url(forResource: musicNames[4], withExtension: "mp3")
        do{
            audioPlayer = try AVAudioPlayer(contentsOf: audioFile)
        }catch let error as NSError {
            print("Error :\(error)")
        }
        audioPlayer.play()
    }
    
    @IBAction func btnStop(_ sender: UIButton) {
        audioPlayer.stop()
    }
    

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

