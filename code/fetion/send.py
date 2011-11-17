# -*- coding: cp936 -*-
from django.http import HttpResponse
from PyFetion import *
def getPhone():
	if 'phone' not in globals():
		print('login')
		global phone
		phone = PyFetion('飞信帐号','飞信密码')
		phone.login()
	return phone

def send(request,tel,msg):
	try:
		i = int(tel)
		phone = getPhone()
		msg = msg.encode('utf-8')
		rsp = phone.send_sms(msg,tel)
		return HttpResponse(rsp)
	except Exception,e:
		return HttpResponse(e.__str__)
