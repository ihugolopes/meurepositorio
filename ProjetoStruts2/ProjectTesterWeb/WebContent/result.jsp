<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<body>
	<h1>
		Struts 2
		<s:file>file upload</s:file>
	</h1>

	<h2>
		File Name :
		<s:property value="fileUploadFileName" />
	</h2>

	<h2>
		Content Type :
		<s:property value="fileUploadContentType" />
	</h2>

	<h2>
		File :
		<s:property value="fileUpload" />
	</h2>

</body>
</html>