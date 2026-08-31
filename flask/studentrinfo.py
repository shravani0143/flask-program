from flask import Flask
app =Flask(__name__)
@app.route('/')
def biodata():
    return """
     <h1>student Biodata<h1>
     <hr>
     Name:Sarthak suryavanshi<br><br>
     Roll No:101<br><br>
     Class:TYBCA<br><br>

     Department:Computetr Science<br><br>
     Email:sarthaksuryawanshi737@gmail.com<br><br>
     Mobile No:9876543210<br><br>
     """
if __name__=='__main__':
    app.run(debug=True)