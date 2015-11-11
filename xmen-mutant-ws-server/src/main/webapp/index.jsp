<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>X-MEN Mutant WS Server</title>
</head>
<body>
	<h1>X-MEN Mutant Finder</h1>

	<h2>API Base Path: /services/v01</h2>

	<b>RESTless Resource /dnaSequence</b>
	<br />
	<ul>
		<li>POST /analize<br />
			<ul>
				<span> <b>Request.</b> <br /> DNASequenceRequest (json
					example): <br /> { "dnaSequence": { "sequences": [ "ATGCGA",
					"CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" ] } }
				</span>
			</ul>
			<ul>&nbsp;
			</ul>
			<ul>
				<span> <b>Response.</b> <br /> DNASequenceResponse (json
					example): <br /> {"mutant":true}
				</span>
			</ul>

		</li>
	</ul>

	<b>RESTfull Resource /Mutants</b>
	<br />
	<ul>
		<li>POST<br />
			<ul>
				<span> <b>Request.</b> <br /> Mutant (json example): <br />
					{ "dnaSequence": { "sequences": [ "ATGCGA", "CAGTGC", "TTATGT",
					"AGAAGG", "CCCCTA", "TCACTG" ] } [, "mutant": false] } }<br /> <br />
					<i>Attribute mutant is optional because is not needed.<br />
						The Resource Mutant es modelated by dnaSequence (array) and mutant
						(boolean) attributes.
				</i>
				</span>
			</ul>
			<ul>&nbsp;
			</ul>
			<ul>
				<span> <b>Response.</b> <br /> Mutant (json example): <br />
					{"dnaSequence":{"sequences":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]},"mutant":true}
				</span>
			</ul>

		</li>
	</ul>
	
	<br />
	
	<h1>Examples</h1>
	<br />
	<h2>RESTless Resource</h2>
	<h3>POST /services/v01/dnaSequence/analize</h3>
	<img alt="" src="./img/restless_example.PNG">
	
	<br />
	<h2>RESTfull Resource</h2>
	<h3>POST /services/v01/mutants</h3>
	<img alt="" src="./img/restfull_example.PNG">
	
</body>
</html>