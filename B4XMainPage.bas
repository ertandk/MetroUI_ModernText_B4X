B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private Name_Text As MetroUI_ModernText
	Private Surname_Text As MetroUI_ModernText
	Private Email_Text As MetroUI_ModernText
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	Dim Hatavar As Boolean
	Hatavar=Text_Kontrol(Name_Text,"Please fill in the Name !",Hatavar)
	Hatavar=Text_Kontrol(Surname_Text,"Please fill in the Surname !",Hatavar)
	Hatavar=Text_Kontrol(Email_Text,"Please fill in the E-Mail !",Hatavar)
End Sub

Sub Text_Kontrol (TextBox As MetroUI_ModernText,HataMesajı As String, HataVar As Boolean) As Boolean
	If TextBox.Text="" Then
		TextBox.ShowError(HataMesajı)
		Return True
	End If
	
	If HataMesajı <> "" Then
		If TextBox.Text = "" Then
			TextBox.ShowError(HataMesajı)
			Return True
		End If
	End If

	If HataVar = True Then ' Bunu Şunun İçin Yaptık Bir Önceki Kontrolde Hata Alırsa O Hata Burayada Gelir. ve Hata Olarak Yine True Döner.
		Return True
	End If
	Return False
End Sub