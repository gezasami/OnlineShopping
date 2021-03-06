<!DOCTYPE html>
<html>
<head>
    <%@ include file="../layout/admin/resource.jsp" %>
</head>
<body>
<div id="wrapper">
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
        <%@ include file="../layout/admin/header.jsp" %>
        <%@ include file="../layout/admin/navbar.jsp" %>
    </nav>
    <div id="page-wrapper">
        <br/>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <p>Category</p>
                            <!--adding pull-right below, does not work-->
                            <span class="btn-group  btn-group-xs pull-right">
                                <a href="/admin/category/insert" class="btn btn-default btn-sm">Insert</a>
                                <a href="#" class="btn btn-default btn-sm">Delete</a>
                            </span>
                        </h4>
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Category Name</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${listCategory.content}" var="categoryItem">
                                    <tr title="/admin/order/${categoryItem.id}" class="">
                                        <td>${categoryItem.name}</td>
                                        <td><a href="/admin/category/edit/${categoryItem.id}">Edit</a></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>
</div>
<%@ include file="../layout/admin/footer.jsp"%>
<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>

</body>

</html>
