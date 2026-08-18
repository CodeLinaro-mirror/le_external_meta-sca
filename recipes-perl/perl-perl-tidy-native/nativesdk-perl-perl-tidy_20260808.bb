SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=9afeda422fe5b2bbffca6a1453849a6d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "038277b43eddd2cb702e8058ca3ff685b3d64e6662361e7ad2158ccfd07291be"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer nativesdk
