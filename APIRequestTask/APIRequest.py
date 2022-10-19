import requests
response = requests.get("https://tradestie.com/api/v1/apps/reddit")
print(response.json())