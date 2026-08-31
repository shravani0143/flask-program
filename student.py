from flask import Flask
app = Flask(__name__)
@app.route("/employee/<name>/<id>/<department>")
def employee(name,id,department):
  return f"""
<h1>employee Details</h1>
<h2>employee Name : </h2> {name}<br> 
<h2>employee id : </h2>{id}<br>
<h2>employee department :</h2>{department}<br><br>
"""
if __name__ == "__main__":
  app.run(debug=True)
