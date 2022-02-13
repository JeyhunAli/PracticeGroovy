package Groovy


	
		def BusinessDate = context.expand( '${CurrentBusinessDate#Response#declare namespace ns1=\'http://www.brinksoftware.com/webservices/sales/v2\'; //ns1:GetCurrentBusinessDateResponse[1]/ns1:GetCurrentBusinessDateResult[1]/ns1:BusinessDate[1]}' )
		def XMLDate = new Date().parse("yyyy-MM-dd",BusinessDate)
		def NextBD = XMLDate + 5
		def Formatdate = NextBD.format("yyyy-MM-dd")
		return Formatdate
		
	

