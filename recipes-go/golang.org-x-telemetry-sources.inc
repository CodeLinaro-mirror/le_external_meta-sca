SRC_URI += "https://proxy.golang.org/golang.org/x/telemetry/@v/v0.0.0-20260710170516-c325552849a7.zip;srcoutput=golang.org/x/telemetry;srcinput=golang.org/x/telemetry@v0.0.0-20260710170516-c325552849a7;downloadfilename=golang-org-x-telemetry-0.0.0-20260710170516-c325552849a7.zip;name=golang-org-x-telemetry"
SRC_URI[golang-org-x-telemetry.sha256sum] = "bb1ff721d0c9e371f4f581c36033229d1afda773c586e3cf04795cc16c21e6d4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/telemetry/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-telemetry-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
