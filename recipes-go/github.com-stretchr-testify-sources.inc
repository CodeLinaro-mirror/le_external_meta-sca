SRC_URI += "https://proxy.golang.org/github.com/stretchr/testify/@v/v1.12.1.zip;srcoutput=github.com/stretchr/testify;srcinput=github.com/stretchr/testify@v1.12.1;downloadfilename=github-com-stretchr-testify-1.12.1.zip;name=github-com-stretchr-testify"
SRC_URI[github-com-stretchr-testify.sha256sum] = "6874ed1c4b0b7e9feb27989b16c179b36590020633436ae260cefc5f5565589f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    ISC \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/stretchr/testify/LICENSE;md5=188f01994659f3c0d310612333d2a26f \
    file://github.com/stretchr/testify/internal/difflib/LICENSE;md5=37bee94299cc4febcbc4c52da854074d \
    file://github.com/stretchr/testify/internal/spew/LICENSE;md5=c06795ed54b2a35ebeeb543cd3a73e56 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-testify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-objx-sources.inc', '', 'github.com-stretchr-objx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.yaml.in-yaml-v3-sources.inc', '', 'go.yaml.in-yaml-v3-sources.inc', d)}
