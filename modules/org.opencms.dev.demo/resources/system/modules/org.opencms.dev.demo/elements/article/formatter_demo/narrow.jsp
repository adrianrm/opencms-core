<%@page buffer="none" session="false" taglibs="c,cms" %>
<cms:formatter var="content" val="value">
	<div class="container-box color-blue">
		<%-- Title of the article --%>
		<h5>${value.Title}</h5>
		<p><i>This formatter has the maxwidth=250 attribute set in the coressponding resource xsd file.</i></p>
		<%-- Text of the article --%>
		<p>${value.Text}</p>		
	</div>
</cms:formatter>