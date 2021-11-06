B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
#DesignerProperty: Key: MyPanelRadius, DisplayName: Panel Radius, FieldType: int, DefaultValue: 100
#DesignerProperty: Key: MyPanelBackgroundColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Panel Background color
#DesignerProperty: Key: CircleColor, DisplayName: Circle Color, FieldType: Color, DefaultValue: 0xFF067DC1, Description: Circle Color

#DesignerProperty: Key: iconCircleSize, DisplayName: icon Size , FieldType: int, DefaultValue: 20, Description: icon Circle Size
#DesignerProperty: Key: iconCircleColor, DisplayName: icon Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: icon Circle Color

#DesignerProperty: Key: HintText, DisplayName: Hint Text, FieldType: String, DefaultValue: Name, Description: Hint Text


Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	
	Dim img As ImageView
	
	
	
	Dim MyPanel As Panel
	Dim MyTextboxB4X As B4XView
	
	
	Dim iconCircleB4X As B4XView
	Dim iconCircle As Label
	Private MyHintLabel As B4XView
	Private MyHLabel As Label 'MyHintLabel Buna Eşitledik.Object i label a çevirdik gibi.
	
	Private MyErrorLabelB4X As B4XView
	Private MyErrorLabel As Label 'MyHintLabel Buna Eşitledik.Object i label a çevirdik gibi.
	
	Private ilkAcilis As Boolean=True
	Private NormalHintArkaPlanUzunlugu As Double
#if B4A

	Dim MyTextbox As EditText
	Dim PanelArkaPlanOzellikleri As ColorDrawable
	
	#Else
	Dim MyTextbox As TextField
	Private svg As SVG
	#End If
'	---------------------------------------------------
	
	
	Dim MyPanelRadiusProperty As Int
	Dim MyPanelBackgroundColorProperty As String
	Dim CircleColorProperty As Int
	Dim iconCircleSizeProperty As Int
	Dim iconCircleColorProperty As String
	Dim HintNameProperty As String
	
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	img.Initialize("img")
	MyPanel.Initialize("MyPanel")
	
	iconCircle.Initialize("iconCircle")
	MyHLabel.Initialize("MyHLabel")
	MyErrorLabel.Initialize("MyErrorLabel")
	
	#if B4A
	MyTextbox.Initialize("MyTextbox")
	
	
	#else
	MyTextbox.Initialize("MyTextbox")
	MyTextbox.BorderStyle=0
	
	
	#End If
	MyTextboxB4X=MyTextbox
	iconCircleB4X=iconCircle
	MyHintLabel=MyHLabel
	MyErrorLabelB4X=MyErrorLabel
'	--------------------------------

End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, lbl As Label, Props As Map)
	mBase = Base
	Tag = mBase.Tag
	mBase.Tag = Me
	
'	img.Gravity=Gravity.FILL
	
	Dim HintYukseklik As Int=DipToCurrent(MyHintLabel.TextSize/0.77)
	
	MyPanelRadiusProperty = Props.Get("MyPanelRadius")
	MyPanelBackgroundColorProperty = Props.Get("MyPanelBackgroundColor")
	CircleColorProperty = Props.Get("CircleColor")
	iconCircleSizeProperty = Props.Get("iconCircleSize")
	iconCircleColorProperty = Props.Get("iconCircleColor")
	HintNameProperty = Props.Get("HintText")
	
	
	
	#if b4a
	
	
	PanelArkaPlanOzellikleri.Initialize2(MyPanelBackgroundColorProperty,MyPanelRadiusProperty,0,Colors.White)
	MyPanel.Background=PanelArkaPlanOzellikleri
	
	 #else
	 
	MyPanel.SetBorder(0,xui.Color_White,MyPanelRadiusProperty)
	MyPanel.Color=xui.Color_White
	 
	#End If
	#if b4i
	mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Height-2dip)
	#else
	mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Height)
	#End If
	#if b4i
	MyPanel.AddView(MyTextboxB4X,65dip,0,mBase.Width-70dip,MyPanel.Height)
	MyPanel.AddView(img,0,0,MyTextboxB4X.left-5dip  ,mBase.Height-2dip)
	#else
	MyPanel.AddView(MyTextboxB4X,60dip,0,mBase.Width-70dip,MyPanel.Height)
	MyPanel.AddView(img,0,0,MyTextboxB4X.left  ,mBase.Height-1dip)
	#End If
	MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,img.Width,img.Height)
	
	MyTextboxB4X.Color=Colors.Transparent
	
	#if b4a
	
	
	Dim c As Canvas
	
	Dim b As Bitmap
	Dim bc As ByteConverter
	Dim svg As ioxSVG
	Dim val(1) As Int
	val(0)=CircleColorProperty
	Dim ColorSet As String = bc.HexFromBytes(bc.IntsToBytes(val))
	ColorSet="#" & ColorSet.SubString(2)
	b.InitializeMutable(img.Width,img.Height)
	c.Initialize2(b)
	svg.Initialize2($"<?xml version="1.0" encoding="UTF-8" ?>
	<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
	<svg width="100%" height="100%" viewBox="0 0 128 115" preserveAspectRatio="none" version="1.1" xmlns="http://www.w3.org/2000/svg">
	<g id="#fc7424ff">
	<path fill="${ColorSet}" opacity="1.00" d=" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z" />
	</g>
	</svg>
	"$)
	svg.DocumentWidth = img.Width
	svg.DocumentHeight = img.Height
	svg.RenderToCanvas(c)
	img.Bitmap=b
	
	#else
	
	svg.Initialize(File.DirAssets,"icon.svg")
	
	img.Bitmap=svg.Export(img.Width,img.Height)
	
	Log(File.ReadString(File.DirAssets,"icon.svg"))
	
	#End If
	
	Dim IconFont As B4XFont
	#if b4a
		IconFont = xui.CreateFont(Typeface.FONTAWESOME,iconCircleSizeProperty)

	#Else
	IconFont = xui.CreateFont(Font.CreateFontAwesome(iconCircleSizeProperty),iconCircleSizeProperty)

	#End If
	
	iconCircleB4X.SetTextAlignment("CENTER","CENTER")
	iconCircleB4X.TextColor=iconCircleColorProperty
	iconCircleB4X.TextSize=iconCircleSizeProperty
	
	iconCircleB4X.Font=IconFont
	iconCircleB4X.Text=""
	
	MyHintLabel.Text=HintNameProperty
	NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNameProperty)
	MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left + 4dip,MyPanel.Height/2 - 11dip,NormalHintArkaPlanUzunlugu,HintYukseklik)
	
	MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left + 4dip,MyPanel.Height - 18dip,MyPanel.Width,20dip)
	MyErrorLabel.Visible=False
	
	MyErrorLabelB4X.TextColor=xui.Color_Red
	MyErrorLabelB4X.TextSize=11
	MyErrorLabelB4X.Text="Lütfen E-Mail Adresinizi Giriniz!"
	
End Sub

Private Sub UzunlukHesapla (NameText As String) As Double
	Dim UzunPanel As B4XView = xui.CreatePanel("")
	UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,MyPanel.Height)
	Dim canvas1 As B4XCanvas
	canvas1.Initialize(UzunPanel)
	Dim Rect As B4XRect = canvas1.MeasureText(NameText, MyHintLabel.Font)
	Dim Sonuc As Double=(Rect.Width*1.08)
	#if b4i
	Sonuc=Sonuc+3dip
	#End If
	Return Sonuc
End Sub

Public Sub ShowError(ErrorText As String)
	MyErrorLabel.Visible=True
	MyErrorLabel.Text=ErrorText
End Sub

Public Sub ClearError
	MyErrorLabel.Visible=False
End Sub


Private Sub Base_Resize (Width As Double, Height As Double)

End Sub

Public Sub setText(Text As String)
	If ilkAcilis=True Then
'		ilkAcilis=False
		If Text.Length=0 Then
		#If b4a
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextbox.Height/2,MyHintLabel.Width,MyHintLabel.Height)
		#Else
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextboxB4X.Height/2.2,MyHintLabel.Width,MyHintLabel.Height)
		#End if
		Else
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextboxB4X.Top-2.5dip,MyHintLabel.Width,MyHintLabel.Height)
		End If
	End If
	MyTextboxB4X.Text=Text
	
'	MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextBox.Top,MyHintLabel.Width,MyHintLabel.Height)

End Sub

Public Sub getText As String
	Return MyTextboxB4X.Text
End Sub

Public Sub setTextFont(Fnt As B4XFont)
	MyTextboxB4X.Font=Fnt
End Sub

Public Sub getTextFont As B4XFont
	Return MyTextboxB4X.Font
End Sub

Private Sub MyTextBox_BeginEdit
	CallSub2(Me,"MyTextBox_FocusChanged",True)
End Sub
Private Sub MyTextBox_EndEdit
	CallSub2(Me,"MyTextBox_FocusChanged",False)
End Sub

Private Sub MyTextBox_FocusChanged (HasFocus As Boolean)
	If HasFocus = False Then
		If MyTextboxB4X.Text.Length=0 Then
			
'			TextboxOkeyButton.Visible=False
			#if b4a
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyPanel.Height/2 - 10dip,MyHintLabel.Width,MyHintLabel.Height)
			#else
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyPanel.Height/2 - 11dip,MyHintLabel.Width,MyHintLabel.Height)
			#End If
		Else if MyTextboxB4X.Text.Length>0 Then
			
			MyErrorLabel.Visible=False
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextboxB4X.Top-2.5dip,MyHintLabel.Width,MyHintLabel.Height)
'			TextboxOkeyButton.Visible=False
		End If
	Else
		If MyTextboxB4X.Text.Length=0 Then
						
			MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextboxB4X.Top-2.5dip,MyHintLabel.Width,MyHintLabel.Height)
'			TextboxOkeyButton.Text=""
'			TextboxOkeyButton.Visible=True
		Else
'			TextboxOkeyButton.Text=""
'			TextboxOkeyButton.Visible=True
			
			
		End If
	End If
	If xui.SubExists(mCallBack,mEventName & "_FocusChanged",1) Then CallSub2(mCallBack,mEventName & "_FocusChanged",HasFocus)
End Sub
#Region Event

Private Sub MyTextBox_TextChanged (Old As String, New As String)
	
	If New.Length>Old.Length Then
		MyErrorLabel.Visible=False
		MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextboxB4X.Top-2.5dip,MyHintLabel.Width,MyHintLabel.Height)

'	Else if New.Length=0 Then
'	
'		MyHintLabel.SetLayoutAnimated(200,MyHintLabel.left,MyTextBox.Height/2,MyHintLabel.Width,MyHintLabel.Height)

		
	End If
	
	If xui.SubExists(mCallBack,mEventName & "_TextChanged",2) Then CallSub3(mCallBack,mEventName & "_TextChanged",Old,New)
End Sub

private Sub MyTextBox_EnterPressed
	#if b4i
'	MyTextboxB4X.ResignFocus
    #end if
	If xui.SubExists(mCallBack,mEventName & "_EnterPressed",0) Then CallSub(mCallBack,mEventName & "_EnterPressed")
End Sub

Private Sub MyTextBox_Action
	If xui.SubExists(mCallBack,mEventName & "_EnterPressed",0) Then CallSub(mCallBack,mEventName & "_EnterPressed")
End Sub

#END Region