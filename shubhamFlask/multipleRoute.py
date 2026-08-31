from flask import Flask
app=flask (__name__)
@app.route('/')
def home():
    return"""
    <h1>Welcome to flask App</h1>
    <p>THis is the home page</p>
  """
