class UrlMappings {

	static mappings = {

        group('/report') {
            "/user"(controller: 'Report', namespace: 'user')
            "/course"(controller: 'Report', namespace: 'course')
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
