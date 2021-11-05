B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	
	Dim img As ImageView
	Dim Color As String
	
	Dim MyPanel As Panel
	Dim MyTextbox As EditText
	
	Dim PhotoPanel As Panel
	
	
	
	Private Labelb4x As B4XView
	Private Label As Label
	
	Dim PhotoPanel As Panel
	
	Dim canvas1 As Canvas
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	img.Initialize("img")
	MyPanel.Initialize("MyPanel")
	PhotoPanel.Initialize("PhotoPanel")
	MyTextbox.Initialize("MyTextbox")
	
	Label.Initialize("Label")

	Labelb4x  = Label

End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, lbl As Label, Props As Map)
	mBase = Base
	Tag = mBase.Tag
	mBase.Tag = Me
	img.Gravity=Gravity.FILL
	
	Dim PanelArkaPlanOzellikleri As ColorDrawable
	PanelArkaPlanOzellikleri.Initialize2(Colors.White,80,0,Colors.White)
	MyPanel.Background=PanelArkaPlanOzellikleri
	
	mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Height)
	MyPanel.AddView(MyTextbox,70dip,0,mBase.Width-70dip,MyPanel.Height)
	MyPanel.AddView(img,-0.5dip,0,MyTextbox.left  ,mBase.Height)
	
	MyTextbox.Color=Colors.Transparent
	
	Dim c As Canvas
	
	Dim b As Bitmap
	
	Dim svg As ioxSVG
	
	b.InitializeMutable(img.Width,img.Height)
	
	
	c.Initialize2(b)
	Color="#067dc1"
	
	svg.Initialize2($"<?xml version="1.0" encoding="UTF-8" ?>
	<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
	<svg width="100%" height="100%" viewBox="0 0 128 115" preserveAspectRatio="none" version="1.1" xmlns="http://www.w3.org/2000/svg">
	<g id="#fc7424ff">
	<path fill="${Color}" opacity="1.00" d=" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z" />
	</g>
	</svg>
	"$)
	
	svg.DocumentWidth = img.Width
	svg.DocumentHeight = img.Height
	
	svg.RenderToCanvas(c)
	img.Bitmap=b
	

	Log(img.Height)

'	Dim IconFont As B4XFont
'	#if B4A
'	IconFont = xui.CreateFont(Typeface.LoadFromAssets("icomoon.ttf"),128)
'	#Else	
'	Dim fx As JFX
'	IconFont = xui.CreateFont(fx.LoadFont(File.DirAssets,"icomoon.ttf",64),64)
'	#End if
'	
'	Labelb4x.Font = IconFont
'	
'	Labelb4x.TextSize = 50
'	Labelb4x.TextColor = xui.Color_Blue
'	Labelb4x.Color=Colors.Red
'	Labelb4x.SetTextAlignment("CENTER","CENTER")
'
'	Labelb4x.Text = Chr(0xe900)
'		
'	mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Height)
'	
'	MyPanel.AddView(Labelb4x,0,0,150,MyPanel.Height)

End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub