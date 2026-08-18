SRC_URI += "https://proxy.golang.org/github.com/stretchr/testify/@v/v1.12.0.zip;srcoutput=github.com/stretchr/testify;srcinput=github.com/stretchr/testify@v1.12.0;downloadfilename=github-com-stretchr-testify-1.12.0.zip;name=github-com-stretchr-testify"
SRC_URI[github-com-stretchr-testify.sha256sum] = "f0c60295b42ab8de3ddde4b5030899380ac477fb0503f444e3159d12b5332d8f"

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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v3-sources.inc', '', 'gopkg.in-yaml.v3-sources.inc', d)}
