SRC_URI += "https://proxy.golang.org/go.yaml.in/yaml/v3/@v/v3.0.5.zip;srcoutput=go.yaml.in/yaml/v3;srcinput=go.yaml.in/yaml/v3@v3.0.5;downloadfilename=go-yaml-in-yaml-v3-3.0.5.zip;name=go-yaml-in-yaml-v3"
SRC_URI[go-yaml-in-yaml-v3.sha256sum] = "f2d70caa35f66283aec58b889af8c5f07c374c5934be27a738c1215263e19205"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://go.yaml.in/yaml/v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"

GOSRC_INCLUDEGUARD += "go.yaml.in-yaml-v3-sources.inc"

