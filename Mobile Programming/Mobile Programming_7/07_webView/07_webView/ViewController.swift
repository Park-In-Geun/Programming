//
//  ViewController.swift
//  07_webView
//
//  Created by hallym-de1111 on 2019. 10. 23..
//  Copyright © 2019년 20145184. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UIWebViewDelegate {
    @IBOutlet var txtUrl: UITextField!
    @IBOutlet var myWebView: UIWebView!
    @IBOutlet var myActivityIndicator: UIActivityIndicatorView!
    
    // 일반 func을 생성하여 프로그램 시작시 해당 함수 호출
    func loadWebPage(_ url : String){
        let myUrl = URL(string: url) // 파라미터로 받은 주소(문자열)를 myUrl 에 넣음
        let myRequest = URLRequest(url : myUrl!)
        // myRequest 에 문자열 주소를 url 형태로 넣음
        myWebView.loadRequest(myRequest) // url 형태의 주소로 홈페이지를 로드함
    }
    
    //프로그램 시작시 viewDidLoad() 함수가 실행됨으로 해당 함수에서 loadWebPage 함수 호출
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        myWebView.delegate = self // 웹뷰 델리게이트를 자기 자신으로 줌
        loadWebPage("https://www.hallym.ac.kr") // 시작시 한림대학교 홈페이지 로드
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    func webViewDidStartLoad(_ webView: UIWebView) {
        //웹 뷰가 시작될 때 인디케이터를 시작
        myActivityIndicator.startAnimating()
    }
    
    func webViewDidFinishLoad(_ webView: UIWebView) {
        //웹 뷰가 종료될 때 인디케이터를 종료
        myActivityIndicator.stopAnimating()
    }
    
    // Go 버튼 클릭시 텍스트 필드에 있는 주소로 이동
    @IBAction func btnGotoUrl(_ sender: UIButton) {
        let myUrl = checkUrl(txtUrl.text!) // myUrl에 텍스트 필드에 입력된 주소를 checkUrl 함수를 통해 확인하고 반환된 값을 넣음
        txtUrl.text = ""
        loadWebPage(myUrl) // loadWebPage 함수에 myUrl 을 넣어 홈페이지 로드함
    }
    
    // Smart 버튼 클릭시
    @IBAction func btnGotoSite1(_ sender: UIButton) {
        loadWebPage("https://smart.hallym.ac.kr/index.jsp")
        //한림대학교 스마트 캠퍼스 홈페이지를 로드함
    }
    
    // mail 버튼 클릭시
    @IBAction func btnGotoSite2(_ sender: UIButton) {
         loadWebPage("https://mail.hallym.ac.kr")
        //한림대학교 웹메일 페이지를 로드함
        
    }
    
    // html 버튼 클릭시
    @IBAction func btnLoadHtmlString(_ sender: UIButton) {
        let htmlString = "<h1> HTML String </h1><p> String 변수를 이용한 웹 페이지 </p><p><a href=\"http://2sam.net\">2sam</a>으로 이동</p>"
        myWebView.loadHTMLString(htmlString, baseURL: nil)
        // htmlString 안의 내용을 웹뷰 에 출력하고 기본 URL 은 nil 로 지정
    }
    
    // File 버튼 클릭시
    @IBAction func btnLoadHtmlFile(_ sender: UIButton) {
        let myHtmlBundle = Bundle.main
        let filePath = myHtmlBundle.path(forResource: "htmlView", ofType: "html")
        loadWebPage(filePath!)
        //html 파일을 로드하기 위해 Bundle.main.path 로 파일명, 확장자 명을 주고 파일을 로드함
    }
    
    @IBAction func btnStop(_ sender: UIBarButtonItem) {
        //웹페이지 로딩 중지
        myWebView.stopLoading()
    }
    
    @IBAction func btnReload(_ sender: UIBarButtonItem) {
        //웹페이지 재로딩(새로고침)
        myWebView.reload()
    }
    
    @IBAction func btnGoBack(_ sender: UIBarButtonItem) {
        //이전 웹 페이지로 이동
        myWebView.goBack()
    }
    
    @IBAction func btnGoForward(_ sender: UIBarButtonItem) {
        //다음 웹 페이지로 이동
        myWebView.goForward()
    }
    
    // 주소를 체크하는 함수 리턴 타입은 String
    func checkUrl(_ url: String) -> String {
        var strUrl = url // 파라미터 값을 strUrl에 넣음
        let flag = strUrl.hasPrefix("http://") //주소 입력시 앞에 http:// 으로 고쳐줌
        if !flag { // 고쳐야 할 경우
            strUrl = "http://" + strUrl /
        }
        return strUrl // 주소 반환
    }
    
}

