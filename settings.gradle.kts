rootProject.name = "quizy"

include("gateway-service")

include("common")

include("quiz-service")
include("quiz-service:quiz-infra")
include("quiz-service:quiz-domain")
include("quiz-service:quiz-application")
include("quiz-service:quiz-application:app-api")

include("user-service")
include("user-service:user-infra")
include("user-service:user-domain")
include("user-service:user-application")
include("user-service:user-application:app-api")

include("game-service")
include("game-service:game-infra")
include("game-service:game-domain")
include("game-service:game-application")
include("game-service:game-application:app-api")

include("matching-service")
include("matching-service:matching-infra")
include("matching-service:matching-domain")
include("matching-service:matching-application")
include("matching-service:matching-application:app-api")

include("search-service")
include("search-service:search-infra")
include("search-service:search-domain")
include("search-service:search-application")
include("search-service:search-application:app-api")

include("infrastructure:kafka")





