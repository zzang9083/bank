//package com.project.infrastructure.client.builder.kakao;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.search.infrastructure.client.builder.LocationResponseBody;
//import com.search.infrastructure.entity.LocationEntities;
//import com.search.infrastructure.entity.LocationEntity;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//
//import static java.util.stream.Collectors.toList;
//
//@Getter @Setter
//public class KakaoResponseBody implements LocationResponseBody {
//    @JsonProperty("documents")
//    private List<Document> documents;
//
//    @Override
//    public LocationEntities ofLocations() {
//        return new LocationEntities(documents.stream().map(Document::ofLocation).collect(toList()));
//    }
//
//
//    @Getter @Setter
//    public static class Document {
//        @JsonProperty("address_name")
//        private String addressName;
//        @JsonProperty("place_name")
//        private String placeName;
//        @JsonProperty("road_address_name")
//        private String roadAddressName;
//
//        public LocationEntity ofLocation() {
//            return LocationEntity.builder()
//                    .source("kakao")
//                    .title(placeName.replaceAll("\\<[^>]*>","").replace(" ",""))
//                    .localAddress(addressName.replaceAll("\\<[^>]*>",""))
//                    .roadAddress(roadAddressName.replaceAll("\\<[^>]*>",""))
//                    .build();
//        }
//    }
//
//}
