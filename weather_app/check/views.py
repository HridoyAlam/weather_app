from django.shortcuts import render

# Create your views here.
def home(request):
	import json
	import requests

	api_resquest = requests.get("https://www.airnowapi.org/aq/observation/zipCode/current/?format=application/json&zipCode=20002&distance=25&API_KEY=680720AB-1BA0-4121-BD8C-A86B575A50FF")

	try:
		api = json.loads(api_resquest.content)
	except Exception as e:
		api = 'Error...'
	return render(request, 'home.html', {'api': api})


def about(request):
	return render(request, 'about.html', {})